package test.AI_assistant.service;

import static org.junit.Assert.*;

import java.lang.reflect.Method;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.Optional;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.yorku.lab.enums.BookingStatus;
import com.yorku.lab.enums.PaymentMethod;
import com.yorku.lab.enums.PaymentType;
import com.yorku.lab.model.Credentials;
import com.yorku.lab.model.Equipment;
import com.yorku.lab.model.PaymentTransaction;
import com.yorku.lab.model.Reservation;
import com.yorku.lab.model.Student;
import com.yorku.lab.model.User;
import com.yorku.lab.repository.EquipmentRepository;
import com.yorku.lab.repository.ReservationRepository;
import com.yorku.lab.repository.UserRepository;
import com.yorku.lab.service.ArrivalMonitor;

public class ArrivalMonitorAITest {

    private ArrivalMonitor monitor;
    private ReservationRepository reservationRepository;
    private EquipmentRepository equipmentRepository;
    private UserRepository userRepository;
    private User user;
    private Equipment equipment;

    @Before
    public void setUp() {
        monitor = new ArrivalMonitor();
        reservationRepository = new ReservationRepository();
        equipmentRepository = new EquipmentRepository();
        userRepository = new UserRepository();

        user = new Student("AI-STU-1", "AI Student", new Credentials("ai.student@yorku.ca", "Pass123!"), "CERT-1");
        equipment = new Equipment("AI-EQ-1", "Microscope", "Lab A");

        userRepository.save(user);
        equipmentRepository.save(equipment);
    }

    @After
    public void tearDown() throws Exception {
        deleteIfExists("data/reservations.csv");
        deleteIfExists("data/users.csv");
        deleteIfExists("data/equipment.csv");
        deleteIfExists("data/payments.csv");
    }

    private void deleteIfExists(String file) throws Exception {
        Path path = Paths.get(file);
        if (Files.exists(path)) {
            Files.delete(path);
        }
    }

    private Reservation saveReservation(String id, LocalDateTime start, LocalDateTime end) {
        Reservation reservation = new Reservation(id, user, equipment, start, end);
        reservationRepository.save(reservation);
        return reservation;
    }

    private void invokePrivate(String methodName) throws Exception {
        Method method = ArrivalMonitor.class.getDeclaredMethod(methodName);
        method.setAccessible(true);
        method.invoke(monitor);
    }

    @Test
    public void testWithinArrivalWindowReturnsTrue() {
        Reservation reservation = saveReservation("RES-AI-1", LocalDateTime.now().minusMinutes(5), LocalDateTime.now().plusHours(1));
        assertTrue(monitor.isWithinArrivalWindow(reservation));
    }

    @Test
    public void testWithinArrivalWindowReturnsFalseBeforeStart() {
        Reservation reservation = saveReservation("RES-AI-2", LocalDateTime.now().plusMinutes(10), LocalDateTime.now().plusHours(1));
        assertFalse(monitor.isWithinArrivalWindow(reservation));
    }

    @Test
    public void testWithinArrivalWindowReturnsFalseAfterDeadline() {
        Reservation reservation = saveReservation("RES-AI-3", LocalDateTime.now().minusMinutes(30), LocalDateTime.now().plusHours(1));
        assertFalse(monitor.isWithinArrivalWindow(reservation));
    }

    @Test
    public void testHandleArrivalDetectedMarksReservationArrived() {
        Reservation reservation = saveReservation("RES-AI-4", LocalDateTime.now().minusMinutes(1), LocalDateTime.now().plusHours(1));
        monitor.handleArrivalDetected(reservation.getReservationId());

        Optional<Reservation> updated = reservationRepository.findById(reservation.getReservationId());
        assertTrue(updated.isPresent());
        assertTrue(updated.get().isArrived());
        assertEquals(BookingStatus.ARRIVED, updated.get().getStatus());
    }

    @Test
    public void testMarkNoShowChangesStatus() {
        Reservation reservation = saveReservation("RES-AI-5", LocalDateTime.now().minusHours(1), LocalDateTime.now());
        monitor.markNoShow(reservation.getReservationId());

        Optional<Reservation> updated = reservationRepository.findById(reservation.getReservationId());
        assertTrue(updated.isPresent());
        assertEquals(BookingStatus.NO_SHOW, updated.get().getStatus());
    }

    @Test
    public void testPrivateCheckArrivalWindowsMarksConfirmedAsNoShow() throws Exception {
        Reservation reservation = saveReservation("RES-AI-6", LocalDateTime.now().minusMinutes(40), LocalDateTime.now().plusMinutes(20));
        invokePrivate("checkArrivalWindows");

        Optional<Reservation> updated = reservationRepository.findById(reservation.getReservationId());
        assertTrue(updated.isPresent());
        assertEquals(BookingStatus.NO_SHOW, updated.get().getStatus());
    }

    @Test
    public void testPrivateCheckArrivalWindowsLeavesArrivedReservationUnchanged() throws Exception {
        Reservation reservation = saveReservation("RES-AI-7", LocalDateTime.now().minusMinutes(40), LocalDateTime.now().plusMinutes(20));
        reservation.markArrived();
        reservationRepository.save(reservation);

        invokePrivate("checkArrivalWindows");

        Optional<Reservation> updated = reservationRepository.findById(reservation.getReservationId());
        assertTrue(updated.isPresent());
        assertEquals(BookingStatus.ARRIVED, updated.get().getStatus());
    }

    @Test
    public void testPrivateCheckArrivalWindowsLeavesFutureReservationConfirmed() throws Exception {
        Reservation reservation = saveReservation("RES-AI-8", LocalDateTime.now().plusMinutes(10), LocalDateTime.now().plusHours(1));
        invokePrivate("checkArrivalWindows");

        Optional<Reservation> updated = reservationRepository.findById(reservation.getReservationId());
        assertTrue(updated.isPresent());
        assertEquals(BookingStatus.CONFIRMED, updated.get().getStatus());
    }

    @Test
    public void testPrivateCheckCompletionsCompletesArrivedReservation() throws Exception {
        Reservation reservation = saveReservation("RES-AI-9", LocalDateTime.now().minusHours(3), LocalDateTime.now().minusHours(1));
        reservation.markArrived();
        reservation.addPayment(new PaymentTransaction("DEP-1", 10.0, PaymentType.DEPOSIT, PaymentMethod.CREDIT, reservation.getReservationId()));
        reservationRepository.save(reservation);

        invokePrivate("checkCompletions");

        Optional<Reservation> updated = reservationRepository.findById(reservation.getReservationId());
        assertTrue(updated.isPresent());
        assertEquals(BookingStatus.COMPLETED, updated.get().getStatus());
    }

}
