package test.AI_assistant.service;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;

import com.yorku.lab.model.Credentials;
import com.yorku.lab.model.Manager;
import com.yorku.lab.service.OnboardingNoticeService;

public class OnboardingNoticeServiceAITest {

    private OnboardingNoticeService service;
    private Manager manager;

    @Before
    public void setUp() {
        service = new OnboardingNoticeService();
        manager = new Manager("mgr-1", "Alex Manager", new Credentials("alex.manager@yorku.ca", "Pass123!"), "Engineering");
    }

    @Test
    public void testGenerateNoticeContainsManagerName() {
        String notice = service.generateOnboardingNotice(manager, "AutoPass123!");
        assertTrue(notice.contains("Alex Manager"));
    }

    @Test
    public void testGenerateNoticeContainsEmail() {
        String notice = service.generateOnboardingNotice(manager, "AutoPass123!");
        assertTrue(notice.contains("alex.manager@yorku.ca"));
    }

    @Test
    public void testGenerateNoticeContainsPassword() {
        String notice = service.generateOnboardingNotice(manager, "AutoPass123!");
        assertTrue(notice.contains("AutoPass123!"));
    }

    @Test
    public void testGenerateNoticeContainsRole() {
        String notice = service.generateOnboardingNotice(manager, "AutoPass123!");
        assertTrue(notice.contains("Manager"));
    }

    @Test
    public void testGenerateNoticeContainsDepartment() {
        String notice = service.generateOnboardingNotice(manager, "AutoPass123!");
        assertTrue(notice.contains("Engineering"));
    }

    @Test
    public void testGenerateNoticeContainsHeader() {
        String notice = service.generateOnboardingNotice(manager, "AutoPass123!");
        assertTrue(notice.contains("YorkU Lab Equipment - Manager Onboarding"));
    }

    @Test
    public void testGenerateNoticeContainsWelcome() {
        String notice = service.generateOnboardingNotice(manager, "AutoPass123!");
        assertTrue(notice.contains("Welcome"));
    }

    @Test
    public void testGenerateNoticeUsesNAWhenDepartmentNull() {
        Manager noDept = new Manager("mgr-2", "Jordan Manager", new Credentials("jordan@yorku.ca", "Pass123!"));
        String notice = service.generateOnboardingNotice(noDept, "AnotherPass1!");
        assertTrue(notice.contains("N/A"));
    }

    @Test
    public void testSendOnboardingNoticePrintsRecipientEmail() {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream oldOut = System.out;
        System.setOut(new PrintStream(output));

        service.sendOnboardingNotice("alex.manager@yorku.ca", "Notice body");

        System.setOut(oldOut);
        assertTrue(output.toString().contains("alex.manager@yorku.ca"));
    }

    @Test
    public void testSendOnboardingNoticePrintsNoticeContent() {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream oldOut = System.out;
        System.setOut(new PrintStream(output));

        service.sendOnboardingNotice("alex.manager@yorku.ca", "Notice body");

        System.setOut(oldOut);
        assertTrue(output.toString().contains("Notice body"));
    }
}
