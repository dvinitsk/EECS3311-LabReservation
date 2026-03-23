package com.yorku.lab.repository;

import com.yorku.lab.enums.AccountStatus;
import com.yorku.lab.enums.AffiliationType;
import com.yorku.lab.enums.UserType;
import com.yorku.lab.model.*;
import com.yorku.lab.pattern.factory.UserFactory;

import java.util.List;
import java.util.Optional;

public class UserRepository extends CsvRepository<User> {

    @Override
    protected String getFileName() { return "users.csv"; }

    @Override
    protected String toCsvLine(User user) {
        String base = escape(user.getType().name()) + "|" +
            escape(user.getUserId()) + "|" +
            escape(user.getFullName()) + "|" +
            escape(user.getCredentials().getEmail()) + "|" +
            escape(user.getCredentials().getPasswordHash()) + "|" +
            escape(user.getStatus() != null ? user.getStatus().name() : "") + "|" +
            escape(user.getAffiliation() != null ? user.getAffiliation().name() : "") + "|" +
            escape(user.getIdOrCertificationNumber());
        if (user instanceof com.yorku.lab.model.Manager m) {
            base += "|" + escape(m.getDepartment());
        }
        return base;
    }

    @Override
    protected User fromCsvLine(String line) {
        String[] parts = splitCsv(line);
        if (parts.length < 6) return null;
        UserType type = UserType.valueOf(parts[0]);
        String userId = parts[1];
        String fullName = parts[2];
        String email = parts[3];
        String passwordHash = parts[4];
        AccountStatus status = parts[5].isEmpty() ? null : AccountStatus.valueOf(parts[5]);
        String idOrCert = parts.length > 7 ? parts[7] : null;
        String department = parts.length > 8 ? parts[8] : null;

        User user = UserFactory.createUser(type, userId, fullName, email, passwordHash, idOrCert);
        if (status != null) user.setStatus(status);
        if (user instanceof com.yorku.lab.model.Manager m && department != null) {
            m.setDepartment(department);
        }
        return user;
    }

    public Optional<User> findByEmail(String email) {
        if (email == null) return Optional.empty();
        String normalized = email.trim().toLowerCase();
        return findAll().stream()
            .filter(u -> u.getCredentials() != null && u.getCredentials().getEmail() != null)
            .filter(u -> normalized.equals(u.getCredentials().getEmail().trim().toLowerCase()))
            .findFirst();
    }

    public Optional<User> findById(String userId) {
        return findAll().stream()
            .filter(u -> userId.equals(u.getUserId()))
            .findFirst();
    }

    public void save(User user) {
        List<User> all = findAll();
        all.removeIf(u -> u.getUserId().equals(user.getUserId()));
        all.add(user);
        saveAll(all);
    }

    public void delete(String userId) {
        List<User> all = findAll();
        all.removeIf(u -> u.getUserId().equals(userId));
        saveAll(all);
    }
}
