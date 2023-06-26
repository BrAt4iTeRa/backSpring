package com.carshop.carshopspring.entity;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

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
    private ClManufacturer manufacturer;

    @ManyToMany(mappedBy = "cars")
    private Set<ClUser> users = new HashSet<>();

    @OneToOne (cascade = CascadeType.ALL)
    @JoinColumn(name = "characteristic_id")
    private Characteristic characteristic;

    public Car(){

    }

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }
}

