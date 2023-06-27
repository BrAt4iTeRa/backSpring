package com.carshop.carshopspring.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table (name = "cars")
public class Car{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    private int carId;

    @Column (name = "price")
    private int price;

    @Column (name = "car_name")
    private String carName;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn (name = "brand_id")
    private Manufacturer manufacturer;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "car_id", referencedColumnName = "id")
    private Set<Order> orders = new HashSet<Order>();

    @OneToOne (cascade = CascadeType.ALL)
    @JoinColumn(name = "characteristic_id")
    private Characteristic characteristic;

}

