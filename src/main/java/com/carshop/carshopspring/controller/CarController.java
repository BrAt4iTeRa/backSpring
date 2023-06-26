package com.carshop.carshopspring.controller;

import com.carshop.carshopspring.entity.Car;
import com.carshop.carshopspring.repository.CarRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Vector;

@Controller
@RequestMapping("/cars")
public class CarController {
    @Autowired
    private CarRepos repos;
    @GetMapping(path = "/all")
    public @ResponseBody Iterable<Car> getCarInfo(){
        return repos.findAll();
    }

}
