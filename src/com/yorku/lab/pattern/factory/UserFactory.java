package com.yorku.lab.pattern.factory;

import com.yorku.lab.enums.UserType;
import com.yorku.lab.model.*;

public class UserFactory {

    public static User createUser(UserType type,String userId, String fullName,String email,String rawPassword) {

        Credentials credentials = new Credentials(email, rawPassword);

        switch (type) {
            case STUDENT:
                return new Student(userId, fullName, credentials);
            case FACULTY:
                return new Faculty(userId, fullName, credentials);
            case RESEARCHER:
                return new Researcher(userId, fullName, credentials);
            case GUEST:
                return new Guest(userId, fullName, credentials);
            case MANAGER:
                return new Manager(userId, fullName, credentials);
            case LABCOORDINATOR:
            	return new LabCoordinator(userId, fullName, credentials);
            default:
                throw new IllegalArgumentException("Unknown user type: " + type);
        }
    }
}
