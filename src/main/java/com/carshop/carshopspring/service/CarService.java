package com.carshop.carshopspring.service;

import com.carshop.carshopspring.dto.CarDto;
import com.carshop.carshopspring.dto.UserDto;
import com.carshop.carshopspring.entity.Car;
import com.carshop.carshopspring.repository.CarRepos;
import com.carshop.carshopspring.repository.UserRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
public class CarService {
    @Autowired
    private CarRepos carRepos;

    public Set<CarDto> getAllCarsInf(){
        Set<CarDto> carsDto = convertToCarDto(carRepos.findAll());
        return carsDto;
    }

    public CarDto convertToCarDto(Car car){
        CarDto carDto = new CarDto(car.getCarId(), car.getCarName(),
                car.getPrice(),
                car.getCharacteristic().getColorType(), car.getCharacteristic().getFuelType(),
                car.getCharacteristic().getMaxSpeed());
        return carDto;
    }

    public Set<CarDto> convertToCarDto(Iterable <Car> cars){
        Set <CarDto> carsDto = new HashSet<>();
        for (Car car: cars)
                carsDto.add (new CarDto(car.getCarId(), car.getCarName(),
                        car.getPrice(),
                        car.getCharacteristic().getColorType(), car.getCharacteristic().getFuelType(),
                        car.getCharacteristic().getMaxSpeed()));
        return carsDto;
    }

    public void deleteById (int id){
        Car car = carRepos.findById(id).get();
        carRepos.delete(car);
    }


    public CarDto getCarInfoById(int id){
        CarDto carDto = convertToCarDto(carRepos.findById(id).get());
        return carDto;
    }

    public void save (Car car){
        carRepos.save(car);
    }

    public Iterable<Car> findAll(){
        return carRepos.findAll();
    }


}
