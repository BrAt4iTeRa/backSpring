package com.carshop.carshopspring.controller;

import com.carshop.carshopspring.entity.Car;
import com.carshop.carshopspring.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/cars")
public class CarController {
    @Autowired
    private CarService carService;
    @GetMapping(path = "/all")
    public @ResponseBody Iterable<Car> getCarInfo(){
        return carService.findAll();
    }
    @PostMapping ("/save")
    public ResponseEntity<Car> saveCar (@RequestBody Car car){
        carService.save(car);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

}
