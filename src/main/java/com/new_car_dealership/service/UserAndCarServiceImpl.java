package com.new_car_dealership.service;

import com.new_car_dealership.dao.UserAndCarDAO;
import com.new_car_dealership.dto.UserAndCar;
import com.new_car_dealership.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserAndCarServiceImpl implements UserAndCarService{

    @Autowired
    private UserAndCarDAO userAndCarDAO;

    @Override
    public List<UserAndCar> getAllUser() {
        return userAndCarDAO.getAllUser();
    }

    @Override
    public void saveUser(UserAndCar dto) {
        userAndCarDAO.saveUser(dto);
    }

    @Override
    public User getUser(int id) {
        return userAndCarDAO.getUser(id);
    }

    @Override
    public void deleteUser(int id) {
       userAndCarDAO.deleteUser(id);
    }
}
