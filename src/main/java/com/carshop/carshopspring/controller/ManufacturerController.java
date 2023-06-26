package com.carshop.carshopspring.controller;

import com.carshop.carshopspring.entity.Manufacturer;
import com.carshop.carshopspring.service.ManufacturerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/manufacturer")
public class ManufacturerController {
    @Autowired
    private ManufacturerService manufacturerService;
    @PostMapping("/save")
    public ResponseEntity<Manufacturer> saveManufacturer(@RequestBody Manufacturer manufacturer){
        manufacturerService.save(manufacturer);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

}
