package com.carshop.carshopspring.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CarDto {
    private int id;
    private String carName;
    private int price;
    private String colorType;
    private String fuelType;
    private int maxSpeed;

    public CarDto(int id, String carName, int price,
                  String colorType, String fuelType, int maxSpeed){
        this.id = id;
        this.carName = carName;
        this.price = price;
        this.colorType = colorType;
        this.fuelType = fuelType;
        this.maxSpeed = maxSpeed;
    }
}
