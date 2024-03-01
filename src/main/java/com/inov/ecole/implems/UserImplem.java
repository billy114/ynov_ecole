package com.inov.ecole.implems;

import com.inov.ecole.models.User;
import com.inov.ecole.repositories.UserRepo;
import com.inov.ecole.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserImplem implements UserService {
    @Autowired
    UserRepo userRepo;

    @Override
    public User createUser(User user) {
        //crypter le password
        //regarder si l'email exite
        //envoyer un email de confirmation
        //...

        return userRepo.save(user);
    }

    @Override
    public Optional<User> getUserById(Long id) {
        return userRepo.findById(id);
    }

    @Override
    public List<User> getUserByEmail(String email) {
        return userRepo.findByEmail(email);
    }

    @Override
    public List<User> searchUserByFirstname(String firstname) {
        return userRepo.findByFirstnameContaining(firstname);
    }

    @Override
    public List<User> getUserByFirstnameOrLastname(String firstname, String lastname) {
        return userRepo.findByFirstnameOrLastname(firstname, lastname);
    }

    @Override
    public List<User> getUserByFirstnameAndLastname(String firstname, String lastname) {
        return userRepo.findByFirstnameAndLastname(firstname, lastname);
    }


}
