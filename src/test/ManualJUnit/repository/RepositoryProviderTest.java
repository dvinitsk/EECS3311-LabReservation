package test.ManualJUnit.repository;

import static org.junit.Assert.*;

import org.junit.Test;

import com.yorku.lab.repository.RepositoryProvider;
import com.yorku.lab.repository.UserRepository;

public class RepositoryProviderTest {

	@Test
	public void testGetUserRepositoryNotNull() {
		UserRepository repo = RepositoryProvider.getUserRepository();
		assertNotNull(repo);
	}

	@Test
	public void testGetUserRepositoryReturnsSameInstance() {
		UserRepository repo1 = RepositoryProvider.getUserRepository();
		UserRepository repo2 = RepositoryProvider.getUserRepository();
		assertSame(repo1, repo2);
	}
}
