package com.inov.ecole.implems;

import com.inov.ecole.models.Address;
import com.inov.ecole.models.Course;
import com.inov.ecole.models.User;
import com.inov.ecole.repositories.AddressRepo;
import com.inov.ecole.repositories.CourseRepo;
import com.inov.ecole.repositories.PromoRepo;
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
    @Autowired
    AddressRepo addressRepo;
    @Autowired
    PromoRepo promoRepo;
    @Autowired
    CourseRepo courseRepo;

    @Override
    public User createUser(User user) {
        return userRepo.save(user);
    }

    @Override
    public User createUserWithAddress(User user) {
        addressRepo.save(user.getAddress());
        return userRepo.save(user);
    }

    @Override
    public User createUserWithAddressAndPromo(User user) {
        addressRepo.save(user.getAddress());
        return userRepo.save(user);
    }

    @Override
    public void addCourseToUser(Long userId, Long courseId) {
        User user = userRepo.findById(userId).get();
        Course course = courseRepo.findById(courseId).get();
        user.getCourses().add(course);
        userRepo.save(user);
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
