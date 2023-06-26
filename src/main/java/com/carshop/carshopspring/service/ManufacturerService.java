package com.carshop.carshopspring.service;

import com.carshop.carshopspring.entity.Manufacturer;
import com.carshop.carshopspring.repository.ManufacturerRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ManufacturerService {
    @Autowired
    private ManufacturerRepos manufacturerRepos;
    public void save (Manufacturer manufacturer){
        manufacturerRepos.save(manufacturer);
    }
}
