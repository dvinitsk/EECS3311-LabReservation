package test.AI_assistant.repository;

import static org.junit.Assert.*;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.yorku.lab.enums.AffiliationType;
import com.yorku.lab.model.Credentials;
import com.yorku.lab.model.Guest;
import com.yorku.lab.model.Manager;
import com.yorku.lab.model.Student;
import com.yorku.lab.model.User;
import com.yorku.lab.repository.UserRepository;

public class UserRepositoryAITest {

    private UserRepository repository;

    @Before
    public void setUp() {
        repository = new UserRepository();
    }

    @After
    public void tearDown() throws Exception {
        deleteIfExists("data/users.csv");
    }

    private void deleteIfExists(String file) throws Exception {
        Path path = Paths.get(file);
        if (Files.exists(path)) {
            Files.delete(path);
        }
    }

    @Test
    public void testSaveAndFindById() {
        repository.save(new Student("UR-U1", "User One", new Credentials("u1@yorku.ca", "Pass123!"), "CERT"));
        assertTrue(repository.findById("UR-U1").isPresent());
    }

    @Test
    public void testFindByIdMissingReturnsEmpty() {
        assertTrue(repository.findById("missing").isEmpty());
    }

    @Test
    public void testFindByEmailIsCaseInsensitive() {
        repository.save(new Guest("UR-U2", "Guest", new Credentials("guest@yorku.ca", "Pass123!"), "CERT"));
        assertTrue(repository.findByEmail("GUEST@YORKU.CA").isPresent());
    }

    @Test
    public void testFindByEmailTrimsWhitespace() {
        repository.save(new Guest("UR-U3", "Guest", new Credentials("trim@yorku.ca", "Pass123!"), "CERT"));
        assertTrue(repository.findByEmail("  trim@yorku.ca  ").isPresent());
    }

    @Test
    public void testFindByEmailNullReturnsEmpty() {
        assertTrue(repository.findByEmail(null).isEmpty());
    }

    @Test
    public void testSaveUpdatesExistingUser() {
        User user = new Guest("UR-U4", "Old Name", new Credentials("update@yorku.ca", "Pass123!"), "CERT");
        repository.save(user);
        user.setFullName("New Name");
        repository.save(user);
        assertEquals("New Name", repository.findById("UR-U4").get().getFullName());
    }

    @Test
    public void testDeleteRemovesUser() {
        repository.save(new Guest("UR-U5", "Delete Me", new Credentials("delete@yorku.ca", "Pass123!"), "CERT"));
        repository.delete("UR-U5");
        assertTrue(repository.findById("UR-U5").isEmpty());
    }

    @Test
    public void testManagerDepartmentIsPreserved() {
        repository.save(new Manager("UR-U6", "Manager", new Credentials("manager@yorku.ca", "Pass123!"), "Engineering"));
        assertEquals("Engineering", ((Manager) repository.findById("UR-U6").get()).getDepartment());
    }

    @Test
    public void testGuestAffiliationIsPreserved() {
        repository.save(new Guest("UR-U7", "Guest User", new Credentials("guest2@yorku.ca", "Pass123!"), "CERT"));
        assertEquals(AffiliationType.GUEST, repository.findById("UR-U7").get().getAffiliation());
    }

    @Test
    public void testFindAllReturnsMultipleUsers() {
        repository.save(new Guest("UR-U8", "Guest A", new Credentials("a@yorku.ca", "Pass123!"), "CERT"));
        repository.save(new Student("UR-U9", "Student B", new Credentials("b@yorku.ca", "Pass123!"), "CERT"));
        assertEquals(2, repository.findAll().size());
    }
}
