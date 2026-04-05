package test.AI_assistant.pattern.singleton;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;

import com.yorku.lab.enums.AccountStatus;
import com.yorku.lab.model.Manager;
import com.yorku.lab.pattern.singleton.LabCoordinatorService;

public class LabCoordinatorServiceAITest {

    @After
    public void tearDown() throws Exception {
        java.nio.file.Path userPath = java.nio.file.Paths.get("data/users.csv");
        if (java.nio.file.Files.exists(userPath)) {
            java.nio.file.Files.delete(userPath);
        }
    }

    @Test
    public void testGetInstanceReturnsObject() {
        assertNotNull(LabCoordinatorService.getInstance());
    }

    @Test
    public void testGetInstanceReturnsSameObject() {
        assertSame(LabCoordinatorService.getInstance(), LabCoordinatorService.getInstance());
    }

    @Test
    public void testGenerateManagerAccountReturnsResult() {
        assertNotNull(LabCoordinatorService.getInstance().generateManagerAccount("Alex", "alex@yorku.ca", "Engineering"));
    }

    @Test
    public void testGenerateManagerAccountReturnsManager() {
        Manager manager = LabCoordinatorService.getInstance().generateManagerAccount("Alex", "alex@yorku.ca", "Engineering").manager();
        assertNotNull(manager);
    }

    @Test
    public void testGeneratedManagerStartsActive() {
        Manager manager = LabCoordinatorService.getInstance().generateManagerAccount("Alex", "alex@yorku.ca", "Engineering").manager();
        assertEquals(AccountStatus.ACTIVE, manager.getStatus());
    }

    @Test
    public void testGeneratedPasswordIsNotNull() {
        String password = LabCoordinatorService.getInstance().generateManagerAccount("Alex", "alex@yorku.ca", "Engineering").generatedPassword();
        assertNotNull(password);
    }

    @Test
    public void testGeneratedPasswordHasLengthTwelve() {
        String password = LabCoordinatorService.getInstance().generateManagerAccount("Alex", "alex@yorku.ca", "Engineering").generatedPassword();
        assertEquals(12, password.length());
    }

    @Test
    public void testOnboardingNoticeContainsName() {
        String notice = LabCoordinatorService.getInstance().generateManagerAccount("Alex", "alex@yorku.ca", "Engineering").onboardingNotice();
        assertTrue(notice.contains("Alex"));
    }

    @Test
    public void testOnboardingNoticeContainsEmail() {
        String notice = LabCoordinatorService.getInstance().generateManagerAccount("Alex", "alex@yorku.ca", "Engineering").onboardingNotice();
        assertTrue(notice.contains("alex@yorku.ca"));
    }

    @Test
    public void testGeneratedManagerDepartmentIsPreserved() {
        Manager manager = LabCoordinatorService.getInstance().generateManagerAccount("Alex", "alex@yorku.ca", "Engineering").manager();
        assertEquals("Engineering", manager.getDepartment());
    }
}
