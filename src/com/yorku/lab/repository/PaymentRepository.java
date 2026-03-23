package com.yorku.lab.repository;

import com.yorku.lab.enums.PaymentMethod;
import com.yorku.lab.enums.PaymentStatus;
import com.yorku.lab.enums.PaymentType;
import com.yorku.lab.model.PaymentTransaction;

import java.util.List;
import java.util.Optional;
import java.util.Set;

public class PaymentRepository extends CsvRepository<PaymentTransaction> {

    @Override
    protected String getFileName() { return "payments.csv"; }

    @Override
    protected String toCsvLine(PaymentTransaction p) {
        return escape(p.getTransactionId()) + "|" +
            p.getAmount() + "|" +
            escape(p.getType().name()) + "|" +
            escape(p.getMethod().name()) + "|" +
            escape(p.getStatus().name()) + "|" +
            escape(p.getReservationId());
    }

    @Override
    protected PaymentTransaction fromCsvLine(String line) {
        String[] parts = splitCsv(line);
        if (parts.length < 5) return null;
        PaymentTransaction p = parts.length > 5 && parts[5] != null && !parts[5].isEmpty()
            ? new PaymentTransaction(parts[0], Double.parseDouble(parts[1]), PaymentType.valueOf(parts[2]),
                PaymentMethod.valueOf(parts[3]), parts[5])
            : new PaymentTransaction(parts[0], Double.parseDouble(parts[1]), PaymentType.valueOf(parts[2]),
                PaymentMethod.valueOf(parts[3]));
        p.setStatus(PaymentStatus.valueOf(parts[4]));
        return p;
    }

    public Optional<PaymentTransaction> findById(String transactionId) {
        return findAll().stream()
            .filter(p -> transactionId.equals(p.getTransactionId()))
            .findFirst();
    }

    public List<PaymentTransaction> findByReservationIds(Set<String> reservationIds) {
        return findAll().stream()
            .filter(p -> p.getReservationId() != null && reservationIds.contains(p.getReservationId()))
            .toList();
    }

    public void save(PaymentTransaction payment) {
        List<PaymentTransaction> all = findAll();
        all.removeIf(p -> p.getTransactionId().equals(payment.getTransactionId()));
        all.add(payment);
        saveAll(all);
    }
}
