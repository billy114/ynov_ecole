package com.inov.ecole.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@Data
public class Course {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    private String name;

    @ManyToMany
//    @JoinTable(
//            name = "suivre",
//            joinColumns = @JoinColumn (name = "course" , referencedColumnName ="id" ),
//            inverseJoinColumns = @JoinColumn (name = "user" , referencedColumnName ="id" )
//    )
    private List<User> users = new ArrayList<>();
}
