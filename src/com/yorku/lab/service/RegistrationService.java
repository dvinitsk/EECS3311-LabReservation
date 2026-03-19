package com.yorku.lab.service;

import com.yorku.lab.enums.AccountStatus;
import com.yorku.lab.enums.AffiliationType;
import com.yorku.lab.enums.UserType;
import com.yorku.lab.model.ApprovalRequest;
import com.yorku.lab.model.User;
import com.yorku.lab.pattern.factory.UserFactory;
import com.yorku.lab.repository.ApprovalRequestRepository;
import com.yorku.lab.repository.UserRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

/**
 * Handles UC1 (Register account), UC2 (Approve account), UC3 (Auto-generate manager).
 */
public class RegistrationService {

    private final UserRepository userRepository = com.yorku.lab.repository.RepositoryProvider.getUserRepository();
    private final ApprovalRequestRepository approvalRepository = new ApprovalRequestRepository();

    private static final String PASSWORD_PATTERN = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";

    public RegistrationResult register(String email, String password, String fullName, UserType userType, String idOrCertificationNumber) {
        if (findByEmail(email).isPresent()) {
            return RegistrationResult.error("Email already in use");
        }
        if (!isPasswordStrong(password)) {
            return RegistrationResult.error("Password must contain uppercase, lowercase, numbers, and symbols");
        }

        String userId = UUID.randomUUID().toString();
        User user = UserFactory.createUser(userType, userId, fullName, email, password, idOrCertificationNumber);

        if (user.getAffiliation() == AffiliationType.UNIVERSITY) {
            user.setStatus(AccountStatus.PENDING_APPROVAL);
            userRepository.save(user);
            ApprovalRequest request = new ApprovalRequest(UUID.randomUUID().toString(), user);
            approvalRepository.save(request);
            return RegistrationResult.pendingApproval("Account created. Pending department approval.");
        } else {
            user.setStatus(AccountStatus.ACTIVE);
            userRepository.save(user);
            return RegistrationResult.success(user);
        }
    }

    public Optional<User> findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    public Optional<User> findById(String userId) {
        return userRepository.findById(userId);
    }

    public boolean isPasswordStrong(String password) {
        return password != null && password.matches(PASSWORD_PATTERN);
    }

    public List<ApprovalRequest> getPendingApprovals() {
        return approvalRepository.findPending();
    }

    public void approveAccount(String requestId) {
        approvalRepository.findById(requestId).ifPresent(ar -> {
            ar.approve();
            userRepository.save(ar.getUser());
            approvalRepository.save(ar);
        });
    }

    public void rejectAccount(String requestId, String reason) {
        approvalRepository.findById(requestId).ifPresent(ar -> {
            ar.reject(reason);
            userRepository.save(ar.getUser());
            approvalRepository.save(ar);
        });
    }

    public record RegistrationResult(boolean success, String message, User user) {
        public static RegistrationResult success(User user) {
            return new RegistrationResult(true, "Account created successfully", user);
        }
        public static RegistrationResult pendingApproval(String message) {
            return new RegistrationResult(true, message, null);
        }
        public static RegistrationResult error(String message) {
            return new RegistrationResult(false, message, null);
        }
    }
}
