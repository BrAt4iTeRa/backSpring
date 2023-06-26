package com.carshop.carshopspring.entity;

import jakarta.persistence.*;

import java.sql.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table (name = "user")
public class ClUser {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    private int userId;
    @Column (name = "user_email")
    private String userEmail;
    @Column (name = "user_name")
    private String userName;
    @Column (name = "user_phone_number")
    private String userPhone;

    @ManyToMany
    @JoinTable(name = "orders",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "car_id")
    )
    private Set<Car> cars = new HashSet<>();

    String getUserName() {
        return userName;
    }
    String getUserEmail() {
        return userEmail;
    }
    String getUserPhone(){
        return userPhone;
    }
    int getUserId(){
        return userId;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
