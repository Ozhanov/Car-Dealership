package com.new_car_dealership.service;

import com.new_car_dealership.dao.CarDAO;
import com.new_car_dealership.dto.CarInputDto;
import com.new_car_dealership.entity.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CarServiceImpl implements CarService{

    @Autowired
    private CarDAO carDAO;

    @Override
    @Transactional
    public List<CarInputDto> getAllCar() {
        return carDAO.getAllCar();
    }

    @Override
    @Transactional
    public void saveCar(CarInputDto dto) {

        carDAO.saveCar(dto);
    }

    @Override
    @Transactional
    public Car getCar(int id) {
        return carDAO.getCar(id);
    }

    @Override
    @Transactional
    public void deleteCar(int id) {
        carDAO.deleteCar(id);
    }
}
