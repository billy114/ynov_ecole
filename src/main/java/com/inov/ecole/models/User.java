package com.inov.ecole.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@Data
public class User {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    @Column(
            nullable = true
    )
    private String firstname;
    private String lastname;
    @Column(
            unique = true,
            nullable = false
    )
    private String email;

    @OneToOne
    @JoinColumn(name = "address_id" ,referencedColumnName = "id")
    private Address address;

    @ManyToOne
    private Promo promo;

    @ManyToMany(mappedBy = "users")
    private List<Course> courses = new ArrayList<>();
}
