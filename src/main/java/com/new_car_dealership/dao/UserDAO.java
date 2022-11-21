package com.new_car_dealership.dao;

import com.new_car_dealership.dto.UserInputDto;
import com.new_car_dealership.entity.User;

import java.util.List;

public interface UserDAO {
    public List<UserInputDto> getAllUser();

    public void saveUser(UserInputDto dto);

    public User getUser(int id);

    public void deleteUser(int id);
}
