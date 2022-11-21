package com.new_car_dealership.dto;

import javax.persistence.Column;

public class UserInputDto {

    public int id;

    public String name;

    public String surname;

    public int age;

    public int year;

    public UserInputDto(int id, String name, String surname, int age, int year) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.year = year;
    }

    public UserInputDto(){

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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
