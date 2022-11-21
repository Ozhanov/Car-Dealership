package com.new_car_dealership.dao.controller;

import com.new_car_dealership.dto.CarInputDto;
import com.new_car_dealership.entity.Car;
import com.new_car_dealership.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping("/cars")
    public List<CarInputDto> showAllCar(){
        return carService.getAllCar();

    }

    @GetMapping("/cars/{id}")
    public Car getCar(@PathVariable int id){
        Car car = carService.getCar(id);
        return car;
    }

    @PutMapping("/cars")
    public void addNewCar(@RequestBody CarInputDto dto){
        carService.saveCar(dto);

    }

    @PostMapping("/cars")
    public void updateCar(@RequestBody CarInputDto dto){
        carService.saveCar(dto);

    }

    @DeleteMapping("/cars/{id}")
    public String deleteCar(@PathVariable int id){
        Car car = carService.getCar(id);

        carService.deleteCar(id);
        return "Car with ID = " + id + " was deleted";
    }

}
