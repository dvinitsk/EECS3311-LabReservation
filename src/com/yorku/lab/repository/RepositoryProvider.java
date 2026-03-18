package com.yorku.lab.repository;

/**
 * Provides shared repository instances so all services read/write the same data.
 * Fixes issue where LabCoordinatorService and RegistrationService used separate
 * instances that could diverge (e.g. different working directories).
 */
public class RepositoryProvider {

    private static final UserRepository USER_REPOSITORY = new UserRepository();

    public static UserRepository getUserRepository() {
        return USER_REPOSITORY;
    }
}
