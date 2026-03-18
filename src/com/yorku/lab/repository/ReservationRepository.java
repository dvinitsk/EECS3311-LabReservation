package com.yorku.lab.repository;

import com.yorku.lab.enums.BookingStatus;
import com.yorku.lab.model.Equipment;
import com.yorku.lab.model.Reservation;
import com.yorku.lab.model.User;
import com.yorku.lab.pattern.state.ReservationStateFactory;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public class ReservationRepository extends CsvRepository<Reservation> {

    private final UserRepository userRepository;
    private final EquipmentRepository equipmentRepository;

    public ReservationRepository() {
        this.userRepository = new UserRepository();
        this.equipmentRepository = new EquipmentRepository();
    }

    public ReservationRepository(UserRepository userRepo, EquipmentRepository eqRepo) {
        this.userRepository = userRepo;
        this.equipmentRepository = eqRepo;
    }

    @Override
    protected String getFileName() { return "reservations.csv"; }

    @Override
    protected String toCsvLine(Reservation r) {
        return escape(r.getReservationId()) + "|" +
            escape(r.getUser().getUserId()) + "|" +
            escape(r.getEquipment().getEquipmentId()) + "|" +
            escape(r.getStartTime().toString()) + "|" +
            escape(r.getEndTime().toString()) + "|" +
            escape(r.getStatus().name()) + "|" +
            r.isArrived();
    }

    @Override
    protected Reservation fromCsvLine(String line) {
        String[] parts = splitCsv(line);
        if (parts.length < 6) return null;

        User user = userRepository.findById(parts[1]).orElse(null);
        Equipment equipment = equipmentRepository.findById(parts[2]).orElse(null);
        if (user == null || equipment == null) return null;

        LocalDateTime start = LocalDateTime.parse(parts[3]);
        LocalDateTime end = LocalDateTime.parse(parts[4]);
        BookingStatus status = BookingStatus.valueOf(parts[5]);
        boolean arrived = parts.length > 6 && Boolean.parseBoolean(parts[6]);

        Reservation r = new Reservation(parts[0], user, equipment, start, end);
        r.setStatus(status);
        r.setArrived(arrived);
        r.setState(ReservationStateFactory.fromStatus(status));
        return r;
    }

    public Optional<Reservation> findById(String reservationId) {
        return findAll().stream()
            .filter(r -> reservationId.equals(r.getReservationId()))
            .findFirst();
    }

    public List<Reservation> findByUser(String userId) {
        return findAll().stream()
            .filter(r -> userId.equals(r.getUser().getUserId()))
            .toList();
    }

    public List<Reservation> findByEquipment(String equipmentId) {
        return findAll().stream()
            .filter(r -> equipmentId.equals(r.getEquipment().getEquipmentId()))
            .toList();
    }

    public void save(Reservation reservation) {
        List<Reservation> all = findAll();
        all.removeIf(r -> r.getReservationId().equals(reservation.getReservationId()));
        all.add(reservation);
        saveAll(all);
    }

    public void delete(String reservationId) {
        List<Reservation> all = findAll();
        all.removeIf(r -> r.getReservationId().equals(reservationId));
        saveAll(all);
    }
}
