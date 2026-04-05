package test.ManualJUnit.pattern.singleton;

import static org.junit.Assert.*;

import org.junit.Test;

import com.yorku.lab.pattern.singleton.LabCoordinatorService;
import com.yorku.lab.pattern.singleton.LabCoordinatorService.ManagerCreationResult;

public class LabCoordinatorServiceTest {

	@Test
	public void testGetInstanceNotNull() {
		LabCoordinatorService service = LabCoordinatorService.getInstance();
		assertNotNull(service);
	}

	@Test
	public void testGetInstanceSingleton() {
		LabCoordinatorService service1 = LabCoordinatorService.getInstance();
		LabCoordinatorService service2 = LabCoordinatorService.getInstance();
		assertSame(service1, service2);
	}

	@Test
	public void testGenerateManagerAccountNotNull() {
		LabCoordinatorService service = LabCoordinatorService.getInstance();
		ManagerCreationResult result = service.generateManagerAccount("Manager One", "mgr1@test.com", "IT");
		assertNotNull(result);
	}

	@Test
	public void testGenerateManagerAccountManagerNotNull() {
		LabCoordinatorService service = LabCoordinatorService.getInstance();
		ManagerCreationResult result = service.generateManagerAccount("Manager Two", "mgr2@test.com", "Admin");
		assertNotNull(result.manager());
	}

	@Test
	public void testGenerateManagerAccountPasswordNotNull() {
		LabCoordinatorService service = LabCoordinatorService.getInstance();
		ManagerCreationResult result = service.generateManagerAccount("Manager Three", "mgr3@test.com", "Ops");
		assertNotNull(result.generatedPassword());
	}

	@Test
	public void testGenerateManagerAccountPasswordLength() {
		LabCoordinatorService service = LabCoordinatorService.getInstance();
		ManagerCreationResult result = service.generateManagerAccount("Manager Four", "mgr4@test.com", "Support");
		assertEquals(12, result.generatedPassword().length());
	}

	@Test
	public void testGenerateManagerAccountOnboardingNotNull() {
		LabCoordinatorService service = LabCoordinatorService.getInstance();
		ManagerCreationResult result = service.generateManagerAccount("Manager Five", "mgr5@test.com", "Finance");
		assertNotNull(result.onboardingNotice());
	}

	@Test
	public void testGenerateManagerAccountManagerNameCorrect() {
		LabCoordinatorService service = LabCoordinatorService.getInstance();
		ManagerCreationResult result = service.generateManagerAccount("Manager Six", "mgr6@test.com", "HR");
		assertEquals("Manager Six", result.manager().getFullName());
	}

	@Test
	public void testGenerateManagerAccountUserIdNotNull() {
		LabCoordinatorService service = LabCoordinatorService.getInstance();
		ManagerCreationResult result = service.generateManagerAccount("Manager Seven", "mgr7@test.com", "Legal");
		assertNotNull(result.manager().getUserId());
	}

	@Test
	public void testGenerateManagerAccountDifferentPasswords() {
		LabCoordinatorService service = LabCoordinatorService.getInstance();
		ManagerCreationResult result1 = service.generateManagerAccount("Manager Eight", "mgr8@test.com", "Tech");
		ManagerCreationResult result2 = service.generateManagerAccount("Manager Nine", "mgr9@test.com", "Sales");
		assertNotEquals(result1.generatedPassword(), result2.generatedPassword());
	}

}
