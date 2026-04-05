package test.AI_assistant.repository;

import static org.junit.Assert.*;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.After;
import org.junit.Test;

import com.yorku.lab.model.Credentials;
import com.yorku.lab.model.Guest;
import com.yorku.lab.model.User;
import com.yorku.lab.repository.RepositoryProvider;
import com.yorku.lab.repository.UserRepository;

public class RepositoryProviderAITest {

    @After
    public void tearDown() throws Exception {
        Path path = Paths.get("data/users.csv");
        if (Files.exists(path)) {
            Files.delete(path);
        }
    }

    @Test
    public void testGetUserRepositoryReturnsObject() {
        assertNotNull(RepositoryProvider.getUserRepository());
    }

    @Test
    public void testGetUserRepositoryReturnsSameInstance() {
        assertSame(RepositoryProvider.getUserRepository(), RepositoryProvider.getUserRepository());
    }

    @Test
    public void testSaveThroughFirstInstanceFindsThroughSecond() {
        UserRepository first = RepositoryProvider.getUserRepository();
        UserRepository second = RepositoryProvider.getUserRepository();
        first.save(new Guest("RP-U1", "Repo Guest", new Credentials("repo@yorku.ca", "Pass123!"), "CERT"));
        assertTrue(second.findById("RP-U1").isPresent());
    }

    @Test
    public void testDeleteThroughSecondAffectsFirst() {
        UserRepository first = RepositoryProvider.getUserRepository();
        UserRepository second = RepositoryProvider.getUserRepository();
        first.save(new Guest("RP-U2", "Repo Guest", new Credentials("repo2@yorku.ca", "Pass123!"), "CERT"));
        second.delete("RP-U2");
        assertTrue(first.findById("RP-U2").isEmpty());
    }

    @Test
    public void testFindByEmailWorksOnSharedRepository() {
        UserRepository repo = RepositoryProvider.getUserRepository();
        repo.save(new Guest("RP-U3", "Repo Guest", new Credentials("shared@yorku.ca", "Pass123!"), "CERT"));
        assertTrue(RepositoryProvider.getUserRepository().findByEmail("shared@yorku.ca").isPresent());
    }

    @Test
    public void testFindAllReflectsSharedState() {
        UserRepository repo = RepositoryProvider.getUserRepository();
        repo.save(new Guest("RP-U4", "Repo Guest A", new Credentials("a1@yorku.ca", "Pass123!"), "CERT"));
        repo.save(new Guest("RP-U5", "Repo Guest B", new Credentials("a2@yorku.ca", "Pass123!"), "CERT"));
        assertEquals(2, RepositoryProvider.getUserRepository().findAll().size());
    }

    @Test
    public void testReturnedRepositoryCanSaveUsers() {
        RepositoryProvider.getUserRepository().save(new Guest("RP-U6", "Repo Guest", new Credentials("a3@yorku.ca", "Pass123!"), "CERT"));
        assertTrue(RepositoryProvider.getUserRepository().findById("RP-U6").isPresent());
    }

    @Test
    public void testReturnedRepositoryCanDeleteUsers() {
        UserRepository repo = RepositoryProvider.getUserRepository();
        repo.save(new Guest("RP-U7", "Repo Guest", new Credentials("a4@yorku.ca", "Pass123!"), "CERT"));
        repo.delete("RP-U7");
        assertTrue(repo.findById("RP-U7").isEmpty());
    }

    @Test
    public void testSharedRepositoryPersistsUpdatedName() {
        UserRepository repo = RepositoryProvider.getUserRepository();
        User user = new Guest("RP-U8", "Old Name", new Credentials("a5@yorku.ca", "Pass123!"), "CERT");
        repo.save(user);
        user.setFullName("New Name");
        repo.save(user);
        assertEquals("New Name", RepositoryProvider.getUserRepository().findById("RP-U8").get().getFullName());
    }

    @Test
    public void testSharedRepositoryStartsNonNullAfterMultipleCalls() {
        assertNotNull(RepositoryProvider.getUserRepository());
        assertNotNull(RepositoryProvider.getUserRepository());
        assertNotNull(RepositoryProvider.getUserRepository());
    }
}
