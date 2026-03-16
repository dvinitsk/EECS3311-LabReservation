package com.yorku.lab.pattern.singleton;

import com.yorku.lab.model.Credentials;
import com.yorku.lab.model.Manager;
import com.yorku.lab.repository.UserRepository;

import java.util.UUID;

public class LabCoordinatorService {

    private static LabCoordinatorService instance;
    private UserRepository userRepository;

    private LabCoordinatorService() {
        this.userRepository = new UserRepository();
    }

    public static LabCoordinatorService getInstance() {
        if (instance == null) {
            instance = new LabCoordinatorService();
        }
        return instance;
    }

    public Manager generateManagerAccount(String name, String email) {
        String userId = UUID.randomUUID().toString();
        String autoPassword = UUID.randomUUID().toString().substring(0, 12);
        Credentials credentials = new Credentials(email, autoPassword);
        Manager manager = new Manager(userId, name, credentials);
        //userRepository.save(manager); for repo
        return manager;
    }
}
