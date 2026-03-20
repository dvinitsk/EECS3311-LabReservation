package com.yorku.lab.pattern.singleton;

import com.yorku.lab.enums.AccountStatus;
import com.yorku.lab.model.Credentials;
import com.yorku.lab.model.Manager;
import com.yorku.lab.repository.RepositoryProvider;
import com.yorku.lab.service.OnboardingNoticeService;

import java.security.SecureRandom;
import java.util.UUID;

/**
 * UC3: Auto-generate Lab Manager accounts.
 * System auto-generates credentials (userId, initial password) and sends onboarding notice.
 */
public class LabCoordinatorService {

    private static LabCoordinatorService instance;
    private final com.yorku.lab.repository.UserRepository userRepository = RepositoryProvider.getUserRepository();
    private final OnboardingNoticeService onboardingService = new OnboardingNoticeService();

    private static final String PASSWORD_CHARS = "ABCDEFGHJKLMNPQRSTUVWXYZabcdefghjkmnpqrstuvwxyz23456789!@#$%";

    private LabCoordinatorService() {}

    public static LabCoordinatorService getInstance() {
        if (instance == null) {
            instance = new LabCoordinatorService();
        }
        return instance;
    }

    /**
     * Generates a manager account with auto-generated credentials.
     * Credentials: userId = UUID, password = 12-char random (uppercase, lowercase, digits, symbols).
     */
    public ManagerCreationResult generateManagerAccount(String name, String email, String department) {
        String userId = "mgr-" + UUID.randomUUID().toString().substring(0, 8);
        String autoPassword = generateSecurePassword(12);
        Credentials credentials = new Credentials(email, autoPassword);
        Manager manager = new Manager(userId, name, credentials, department, 0.0);
        manager.setStatus(AccountStatus.ACTIVE);
        userRepository.save(manager);

        String notice = onboardingService.generateOnboardingNotice(manager, autoPassword);
        onboardingService.sendOnboardingNotice(email, notice);

        return new ManagerCreationResult(manager, autoPassword, notice);
    }

    /**
     * Generates a cryptographically secure random password.
     */
    private String generateSecurePassword(int length) {
        SecureRandom random = new SecureRandom();
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            sb.append(PASSWORD_CHARS.charAt(random.nextInt(PASSWORD_CHARS.length())));
        }
        return sb.toString();
    }

    public record ManagerCreationResult(Manager manager, String generatedPassword, String onboardingNotice) {}
}
