package com.inov.ecole.services;

import com.inov.ecole.models.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    User createUser(User user);
    Optional<User> getUserById (Long id);
    List<User> getUserByEmail (String email);

    List<User> searchUserByFirstname (String firstname);

    List<User> getUserByFirstnameOrLastname (String firstname, String lastname);
    List<User> getUserByFirstnameAndLastname (String firstname, String lastname);
}
