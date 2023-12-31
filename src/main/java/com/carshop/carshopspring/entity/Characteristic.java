package com.carshop.carshopspring.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table (name = "characteristic")
public class Characteristic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    private int id;
    @Column (name = "max_speed")
    private int maxSpeed;
    @Column (name = "fuel_type")
    private String fuelType;
    @Column (name = "color_type")
    private String colorType;

}
