package com.carshop.carshopspring.repository;

import com.carshop.carshopspring.entity.Manufacturer;
import org.springframework.data.repository.CrudRepository;

public interface ManufacturerRepos extends CrudRepository <Manufacturer, Integer> {
}
