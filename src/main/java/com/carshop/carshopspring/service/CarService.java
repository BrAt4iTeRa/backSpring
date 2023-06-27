package com.carshop.carshopspring.service;

import com.carshop.carshopspring.dto.UserDto;
import com.carshop.carshopspring.entity.Car;
import com.carshop.carshopspring.repository.CarRepos;
import com.carshop.carshopspring.repository.UserRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

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
