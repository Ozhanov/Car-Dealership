package com.new_car_dealership.dto;

import javax.persistence.Column;

public class CarInputDto {


    public int id;

    public String name;

    public int volume;

    public int year;

    public String color;

    public int modelID;

    public int userID;

    public CarInputDto(int id, String name, int volume, int year, String color, int modelID) {
        this.id = id;
        this.name = name;
        this.volume = volume;
        this.year = year;
        this.color = color;

        this.modelID = modelID;
    }

    public CarInputDto(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getModelID() {
        return modelID;
    }

    public void setModelID(int modelID) {
        this.modelID = modelID;
    }

    public CarInputDto(int userID) {
        this.userID = userID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }
}
