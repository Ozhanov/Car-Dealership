package com.new_car_dealership.dao;

import com.new_car_dealership.dto.UserAndCar;
import com.new_car_dealership.dto.UserInputDto;
import com.new_car_dealership.entity.User;

import java.util.List;

public interface UserAndCarDAO {
    public List<UserAndCar> getAllUser();

    public void saveUser(UserAndCar dto);

    public User getUser(int id);

    public void deleteUser(int id);
}
