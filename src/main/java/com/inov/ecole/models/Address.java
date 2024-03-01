package com.inov.ecole.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Address {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    private String street;
    private String city;
    private int zipo;

}
