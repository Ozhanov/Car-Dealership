package com.new_car_dealership.service;

import com.new_car_dealership.dto.CarInputDto;
import com.new_car_dealership.entity.Car;
import com.new_car_dealership.entity.User;

import java.util.List;

public interface CarService {
    public List<CarInputDto> getAllCar();

    public void saveCar(CarInputDto dto);

    public Car getCar(int id);

    public void deleteCar(int id);
}
