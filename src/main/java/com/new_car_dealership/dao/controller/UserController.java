package com.new_car_dealership.dao.controller;

import com.new_car_dealership.dao.UserAndCarDAO;
import com.new_car_dealership.dto.UserAndCar;
import com.new_car_dealership.dto.UserInputDto;
import com.new_car_dealership.entity.User;
import com.new_car_dealership.service.UserAndCarService;
import com.new_car_dealership.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserAndCarService userAndCarService;

    @GetMapping("/users")
    public List<UserAndCar> showAllUser(){
       return userAndCarService.getAllUser();

    }

    @GetMapping("/users/{id}")
    public User getUser(@PathVariable int id){
        User user = userAndCarService.getUser(id);
        return user;
    }

    @PutMapping("/users")
    public void addNewUser(@RequestBody UserAndCar dto){
        userAndCarService.saveUser(dto);

    }

    @PostMapping("/users")
    public void updateUser(@RequestBody UserAndCar dto){
        userAndCarService.saveUser(dto);

    }

    @DeleteMapping("/users/{id}")
    public String deleteUser(@PathVariable int id){
        User user = userAndCarService.getUser(id);

        userAndCarService.deleteUser(id);
        return "User with ID = " + id + " was deleted";
    }

}
