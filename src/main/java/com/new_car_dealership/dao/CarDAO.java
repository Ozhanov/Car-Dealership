package com.new_car_dealership.dao;

import com.new_car_dealership.dto.CarInputDto;
import com.new_car_dealership.entity.Car;

import java.util.List;

public interface CarDAO {
    public List<CarInputDto> getAllCar();

    public void saveCar(CarInputDto dto);

    public Car getCar(int id);

    public void deleteCar(int id);
}
