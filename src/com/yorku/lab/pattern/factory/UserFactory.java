package com.yorku.lab.pattern.factory;

import com.yorku.lab.enums.UserType;
import com.yorku.lab.model.*;

public class UserFactory {

    public static User createUser(UserType type, String userId, String fullName, String email, String rawPassword) {
        return createUser(type, userId, fullName, email, rawPassword, null, 0.0);
    }

    public static User createUser(UserType type, String userId, String fullName, String email, String rawPassword, String idOrCertificationNumber, double funds) {
        Credentials credentials = new Credentials(email, rawPassword);
        
        switch (type) {
            case STUDENT:
                return idOrCertificationNumber != null
                    ? new Student(userId, fullName, credentials, idOrCertificationNumber, funds)
                    : new Student(userId, fullName, credentials, funds);
            case FACULTY:
                return idOrCertificationNumber != null
                    ? new Faculty(userId, fullName, credentials, idOrCertificationNumber, funds)
                    : new Faculty(userId, fullName, credentials, funds);
            case RESEARCHER:
                return idOrCertificationNumber != null
                    ? new Researcher(userId, fullName, credentials, idOrCertificationNumber, funds)
                    : new Researcher(userId, fullName, credentials, funds);
            case GUEST:
                return idOrCertificationNumber != null
                    ? new Guest(userId, fullName, credentials, idOrCertificationNumber, funds)
                    : new Guest(userId, fullName, credentials, funds);
            case MANAGER:
                return new Manager(userId, fullName, credentials, funds);
            case LABCOORDINATOR:
                return new LabCoordinator(userId, fullName, credentials, funds);
            default:
                throw new IllegalArgumentException("Unknown user type: " + type);
        }
    }
}
