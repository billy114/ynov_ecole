package com.inov.ecole.controllers;

import com.inov.ecole.models.User;
import com.inov.ecole.repositories.UserRepo;
import com.inov.ecole.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping
    public ResponseEntity<User> createUser (@RequestBody User user){
        return new ResponseEntity<>(
                userService.createUser(user),
                HttpStatus.CREATED
        );
    }

    @GetMapping("{id}")
    public ResponseEntity<?> getUserById (@PathVariable Long id){
        Optional<User> user = userService.getUserById(id);
        if (user.isEmpty())
            return new ResponseEntity<>(
                    HttpStatus.NOT_FOUND
            );

        return new ResponseEntity<>(
                user.get(),
                HttpStatus.OK
        );
    }

    @GetMapping("/by-email/{email}")
    public ResponseEntity<?> getUserByEmail (@PathVariable String email){
        List<User> user = userService.getUserByEmail(email);
        if (user.isEmpty())
            return new ResponseEntity<>(
                    HttpStatus.NOT_FOUND
            );

        return new ResponseEntity<>(
                user.get(0),
                HttpStatus.OK
        );
    }

    @GetMapping("/search-by-firtsname/{firstname}")
    public ResponseEntity<List<User>> searchByFirstname (@PathVariable String firstname){
        List<User> users = userService.searchUserByFirstname(firstname);
        return new ResponseEntity<>(
                users,
                HttpStatus.OK
        );
    }

    @GetMapping("by-firstname-or-lastname/{firstname}/{lastname}")
    public ResponseEntity<List<User>> getUserByFirstnameOrLastname(
            @PathVariable String firstname, @PathVariable String lastname) {
        return new ResponseEntity<>(
                userService.getUserByFirstnameOrLastname(firstname, lastname),
                HttpStatus.OK
        );
    }

    @GetMapping("by-firstname-and-lastname/{firstname}/{lastname}")
    public ResponseEntity<List<User>> getUserByFirstnameAndLastname(
            @PathVariable String firstname, @PathVariable String lastname) {
        return new ResponseEntity<>(
                userService.getUserByFirstnameAndLastname(firstname, lastname),
                HttpStatus.OK
        );
    }
}
