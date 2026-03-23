package com.yorku.lab.service;

import com.yorku.lab.enums.BookingStatus;
import com.yorku.lab.enums.OperationalStatus;
import com.yorku.lab.model.Equipment;
import com.yorku.lab.model.Reservation;
import com.yorku.lab.model.User;
import com.yorku.lab.pattern.strategy.PricingStrategy;
import com.yorku.lab.pattern.strategy.PricingStrategyFactory;
import com.yorku.lab.repository.EquipmentRepository;
import com.yorku.lab.repository.ReservationRepository;
import com.yorku.lab.repository.UserRepository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

/**
 * Handles UC4 (Browse equipment), UC5 (Reserve), UC6 (Modify/Cancel), UC7 (Extend).
 */
public class BookingService {

    private final ReservationRepository reservationRepository;
    private final EquipmentRepository equipmentRepository;
    private final UserRepository userRepository;

    public BookingService() {
        this.reservationRepository = new ReservationRepository();
        this.equipmentRepository = new EquipmentRepository();
        this.userRepository = new UserRepository();
    }

    public BookingService(ReservationRepository resRepo, EquipmentRepository eqRepo, UserRepository userRepo) {
        this.reservationRepository = resRepo;
        this.equipmentRepository = eqRepo;
        this.userRepository = userRepo;
    }

    public List<Equipment> browseEquipment() {
        return equipmentRepository.findAll();
    }

    public List<Equipment> findAvailableEquipment() {
        return equipmentRepository.findAll().stream()
            .filter(e -> e.getOperationalStatus() == OperationalStatus.AVAILABLE)
            .toList();
    }

    public Optional<Equipment> getEquipment(String equipmentId) {
        return equipmentRepository.findById(equipmentId);
    }

    public boolean isSlotAvailable(String equipmentId, LocalDateTime start, LocalDateTime end, String excludeReservationId) {
        List<Reservation> existing = reservationRepository.findByEquipment(equipmentId).stream()
            .filter(r -> r.getStatus() != BookingStatus.CANCELLED && r.getStatus() != BookingStatus.NO_SHOW)
            .filter(r -> excludeReservationId == null || !r.getReservationId().equals(excludeReservationId))
            .toList();

        for (Reservation r : existing) {
            if (start.isBefore(r.getEndTime()) && end.isAfter(r.getStartTime())) {
                return false;
            }
        }
        return true;
    }

    public List<LocalDateTime> suggestNextAvailableSlots(String equipmentId, LocalDateTime from, int count) {
        List<LocalDateTime> suggestions = new ArrayList<>();
        LocalDateTime candidate = from;
        int found = 0;
        while (found < count && candidate.isBefore(from.plusDays(7))) {
            LocalDateTime end = candidate.plusHours(1);
            if (isSlotAvailable(equipmentId, candidate, end, null)) {
                suggestions.add(candidate);
                found++;
            }
            candidate = candidate.plusMinutes(30);
        }
        return suggestions;
    }

    public double calculateDeposit(User user) {
        PricingStrategy strategy = PricingStrategyFactory.getStrategy(user.getType());
        return strategy.calculateDeposit();
    }

    public double calculateHourlyRate(User user) {
        PricingStrategy strategy = PricingStrategyFactory.getStrategy(user.getType());
        return strategy.calculateHourlyRate();
    }

    public Optional<Reservation> createReservation(User user, String equipmentId, LocalDateTime start, LocalDateTime end) {
        Equipment equipment = equipmentRepository.findById(equipmentId).orElse(null);
        if (equipment == null || !equipment.isReservable()) return Optional.empty();
        if (!isSlotAvailable(equipmentId, start, end, null)) return Optional.empty();

        String reservationId = UUID.randomUUID().toString();
        Reservation reservation = new Reservation(reservationId, user, equipment, start, end);
        reservationRepository.save(reservation);
        return Optional.of(reservation);
    }

    public Optional<Reservation> modifyReservation(String reservationId, LocalDateTime newStart, LocalDateTime newEnd) {
        Optional<Reservation> opt = reservationRepository.findById(reservationId);
        if (opt.isEmpty()) return Optional.empty();

        Reservation r = opt.get();
        if (!isSlotAvailable(r.getEquipment().getEquipmentId(), newStart, newEnd, reservationId)) {
            return Optional.empty();
        }
        r.modify(newStart, newEnd);
        reservationRepository.save(r);
        return Optional.of(r);
    }

    public boolean cancelReservation(String reservationId) {
        Optional<Reservation> opt = reservationRepository.findById(reservationId);
        if (opt.isEmpty()) return false;
        opt.get().cancel();
        reservationRepository.save(opt.get());
        return true;
    }

    public Optional<Reservation> extendReservation(String reservationId, LocalDateTime newEnd) {
        Optional<Reservation> opt = reservationRepository.findById(reservationId);
        if (opt.isEmpty()) return Optional.empty();

        Reservation r = opt.get();
        if (!isSlotAvailable(r.getEquipment().getEquipmentId(), r.getEndTime(), newEnd, reservationId)) {
            return Optional.empty();
        }
        r.extend(newEnd);
        reservationRepository.save(r);
        return Optional.of(r);
    }

    public Optional<Reservation> getReservation(String reservationId) {
        return reservationRepository.findById(reservationId);
    }

    public List<Reservation> getReservationsByUser(String userId) {
        return reservationRepository.findByUser(userId);
    }
}
