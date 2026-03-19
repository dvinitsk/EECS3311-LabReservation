package com.yorku.lab.pattern.factory;

import com.yorku.lab.enums.UserType;
import com.yorku.lab.model.*;

public class UserFactory {

    public static User createUser(UserType type, String userId, String fullName, String email, String rawPassword) {
        return createUser(type, userId, fullName, email, rawPassword, null);
    }

    public static User createUser(UserType type, String userId, String fullName, String email, String rawPassword, String idOrCertificationNumber) {
        Credentials credentials = new Credentials(email, rawPassword);

        switch (type) {
            case STUDENT:
                return idOrCertificationNumber != null
                    ? new Student(userId, fullName, credentials, idOrCertificationNumber)
                    : new Student(userId, fullName, credentials);
            case FACULTY:
                return idOrCertificationNumber != null
                    ? new Faculty(userId, fullName, credentials, idOrCertificationNumber)
                    : new Faculty(userId, fullName, credentials);
            case RESEARCHER:
                return idOrCertificationNumber != null
                    ? new Researcher(userId, fullName, credentials, idOrCertificationNumber)
                    : new Researcher(userId, fullName, credentials);
            case GUEST:
                return idOrCertificationNumber != null
                    ? new Guest(userId, fullName, credentials, idOrCertificationNumber)
                    : new Guest(userId, fullName, credentials);
            case MANAGER:
                return new Manager(userId, fullName, credentials);
            case LABCOORDINATOR:
                return new LabCoordinator(userId, fullName, credentials);
            default:
                throw new IllegalArgumentException("Unknown user type: " + type);
        }
    }
}
