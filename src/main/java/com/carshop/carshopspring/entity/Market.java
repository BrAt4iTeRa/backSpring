package com.carshop.carshopspring.entity;

import jakarta.persistence.*;

@Entity
@Table (name = "market")
public class Market {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    private int id;
}
