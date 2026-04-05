package test.AI_assistant.pattern.factory;

import static org.junit.Assert.*;

import org.junit.Test;

import com.yorku.lab.enums.AccountStatus;
import com.yorku.lab.enums.AffiliationType;
import com.yorku.lab.enums.UserType;
import com.yorku.lab.model.Faculty;
import com.yorku.lab.model.Guest;
import com.yorku.lab.model.LabCoordinator;
import com.yorku.lab.model.Manager;
import com.yorku.lab.model.Researcher;
import com.yorku.lab.model.Student;
import com.yorku.lab.model.User;
import com.yorku.lab.pattern.factory.UserFactory;

public class UserFactoryAITest {

    @Test
    public void testCreateStudentWithoutId() {
        User user = UserFactory.createUser(UserType.STUDENT, "S1", "Student One", "s1@yorku.ca", "Pass123!");
        assertTrue(user instanceof Student);
    }

    @Test
    public void testCreateStudentWithId() {
        User user = UserFactory.createUser(UserType.STUDENT, "S2", "Student Two", "s2@yorku.ca", "Pass123!", "CERT-1");
        assertEquals("CERT-1", user.getIdOrCertificationNumber());
    }

    @Test
    public void testCreateFacultyWithoutId() {
        User user = UserFactory.createUser(UserType.FACULTY, "F1", "Faculty One", "f1@yorku.ca", "Pass123!");
        assertTrue(user instanceof Faculty);
    }

    @Test
    public void testCreateResearcherWithoutId() {
        User user = UserFactory.createUser(UserType.RESEARCHER, "R1", "Researcher One", "r1@yorku.ca", "Pass123!");
        assertTrue(user instanceof Researcher);
    }

    @Test
    public void testCreateGuestWithoutId() {
        User user = UserFactory.createUser(UserType.GUEST, "G1", "Guest One", "g1@yorku.ca", "Pass123!");
        assertTrue(user instanceof Guest);
    }

    @Test
    public void testCreateManager() {
        User user = UserFactory.createUser(UserType.MANAGER, "M1", "Manager One", "m1@yorku.ca", "Pass123!");
        assertTrue(user instanceof Manager);
    }

    @Test
    public void testCreateLabCoordinator() {
        User user = UserFactory.createUser(UserType.LABCOORDINATOR, "L1", "Coordinator One", "l1@yorku.ca", "Pass123!");
        assertTrue(user instanceof LabCoordinator);
    }

    @Test
    public void testUniversityUsersStartPendingApproval() {
        User user = UserFactory.createUser(UserType.FACULTY, "F2", "Faculty Two", "f2@yorku.ca", "Pass123!");
        assertEquals(AccountStatus.PENDING_APPROVAL, user.getStatus());
    }

    @Test
    public void testGuestStartsActive() {
        User user = UserFactory.createUser(UserType.GUEST, "G2", "Guest Two", "g2@yorku.ca", "Pass123!");
        assertEquals(AccountStatus.ACTIVE, user.getStatus());
    }

    @Test
    public void testGuestAffiliationIsGuest() {
        User user = UserFactory.createUser(UserType.GUEST, "G3", "Guest Three", "g3@yorku.ca", "Pass123!");
        assertEquals(AffiliationType.GUEST, user.getAffiliation());
    }

    @Test
    public void testCredentialsArePreserved() {
        User user = UserFactory.createUser(UserType.STUDENT, "S3", "Student Three", "s3@yorku.ca", "Pass123!");
        assertEquals("s3@yorku.ca", user.getCredentials().getEmail());
    }

    @Test
    public void testManagerIgnoresOptionalId() {
        User user = UserFactory.createUser(UserType.MANAGER, "M2", "Manager Two", "m2@yorku.ca", "Pass123!", "IGNORE");
        assertNull(user.getIdOrCertificationNumber());
    }

    @Test
    public void testNullUserTypeThrowsException() {
        try {
            UserFactory.createUser(null, "X1", "Null User", "null@yorku.ca", "Pass123!");
            fail("Expected exception for null user type.");
        } catch (Exception expected) {
            assertNotNull(expected);
        }
    }
}
