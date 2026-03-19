package com.yorku.lab.service;

import com.yorku.lab.model.Manager;

/**
 * Generates and delivers onboarding notices for new lab managers.
 * UC3: "System creates manager account, sends onboarding notice."
 */
public class OnboardingNoticeService {

    /**
     * Generates the onboarding notice content with credentials.
     */
    public String generateOnboardingNotice(Manager manager, String generatedPassword) {
        return """
            ============================================
            YorkU Lab Equipment - Manager Onboarding
            ============================================
            
            Welcome, %s!
            
            Your lab manager account has been created.
            
            Login credentials:
              Email:    %s
              Password: %s
              Role:     Manager
              Department: %s
            
            Please log in and change your password after first login.
            
            You can now manage equipment (add, enable, disable, maintenance)
            in the Admin panel.
            
            ============================================
            """.formatted(
            manager.getFullName(),
            manager.getCredentials().getEmail(),
            generatedPassword,
            manager.getDepartment() != null ? manager.getDepartment() : "N/A"
        );
    }

    /**
     * Sends the onboarding notice to the manager's email.
     * In production, this would use an email gateway (SMTP, SendGrid, etc.).
     * For this implementation, we return the notice for the coordinator to forward.
     */
    public void sendOnboardingNotice(String recipientEmail, String noticeContent) {
        // Simulated: In a real system, would call EmailGateway.send(recipientEmail, subject, noticeContent)
        System.out.println("[OnboardingNotice] Would send to " + recipientEmail + ":\n" + noticeContent);
    }
}
