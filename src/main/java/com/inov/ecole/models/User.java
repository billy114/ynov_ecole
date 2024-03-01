package com.inov.ecole.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

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
}
