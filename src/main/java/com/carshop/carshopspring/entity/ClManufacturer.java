package com.carshop.carshopspring.entity;

import jakarta.persistence.*;

import java.util.Vector;

@Entity
@Table (name = "manufacturer")
public class ClManufacturer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    private int brandID;

    @OneToMany (mappedBy = "manufacturer")
    private Vector<Car> cars;
    @Column(name = "name_brand")
    private String nameBrand;

}
