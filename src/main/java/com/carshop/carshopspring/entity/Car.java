package com.carshop.carshopspring.entity;

import jakarta.persistence.*;

@Entity
@Table (name = "cars")
public class Car{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    private int carId;

    @Column (name = "market_id", nullable = true)
    private int marketId;

    @Column (name = "brand_id", nullable = true)
    private int brandId;

    @Column (name = "price")
    private int price;

    @Column (name = "car_name")
    private String carName;

    public Car(){

    }

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public int getMarketId() {
        return marketId;
    }

    public void setMarketId(int marketId) {
        this.marketId = marketId;
    }

    public int getBrandId() {
        return brandId;
    }

    public void setBrandId(int brandId) {
        this.brandId = brandId;
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

