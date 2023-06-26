package com.carshop.carshopspring.repository;

import com.carshop.carshopspring.entity.Car;
import org.springframework.data.repository.CrudRepository;

public interface CarRepos extends CrudRepository <Car, Integer> {

}
