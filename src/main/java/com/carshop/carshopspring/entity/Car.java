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
    private Manufacturer manufacturer;

    @ManyToMany(mappedBy = "cars")
    private Set<User> users = new HashSet<>();

    @OneToOne (cascade = CascadeType.ALL)
    @JoinColumn(name = "characteristic_id")
    private Characteristic characteristic;

    public Car(){

    }

    public int getCarId() {
        return carId;
    }
    public int getPrice() {
        return price;
    }
    public String getCarName() {
        return carName;
    }
    public Manufacturer getManufacturer() {
        return manufacturer;
    }
    public Set<User> getUsers() {
        return users;
    }
    public Characteristic getCharacteristic() {
        return characteristic;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public void setCarName(String carName) {
        this.carName = carName;
    }
    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }
    public void setUsers(Set<User> users) {
        this.users = users;
    }
    public void setCharacteristic(Characteristic characteristic) {
        this.characteristic = characteristic;
    }
}

