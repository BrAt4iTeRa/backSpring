package com.carshop.carshopspring.service;

import com.carshop.carshopspring.entity.Car;
import com.carshop.carshopspring.repository.CarRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarService {
    @Autowired
    private CarRepos carRepos;
    public void save (Car car){
        carRepos.save(car);
    }
    public Iterable<Car> findAll(){
        return carRepos.findAll();
    }
}
