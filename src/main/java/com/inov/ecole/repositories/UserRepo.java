package com.inov.ecole.repositories;

import com.inov.ecole.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {
    User save(User user);
    Optional<User> findById(Long id);
    List<User> findByEmail (String email);
    List<User> findByFirstname (String firstname);
    List<User> findByLastname (String lastname);
    List<User> findAll ();
    void delete(User user);

    List<User> findByFirstnameContaining (String firstname);

    List<User> findByFirstnameOrLastname(String firstname, String lastname);
    List<User> findByFirstnameAndLastname(String firstname, String lastname);
}
