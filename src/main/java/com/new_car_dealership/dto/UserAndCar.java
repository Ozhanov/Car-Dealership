package com.new_car_dealership.dto;

public class UserAndCar {


    public String nameUser;

    public String surnameUser;



    public UserAndCar(){

    }

    public UserAndCar(String nameUser, String surnameUser) {
        this.nameUser = nameUser;
        this.surnameUser = surnameUser;

    }


    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public String getSurnameUser() {
        return surnameUser;
    }

    public void setSurnameUser(String surnameUser) {
        this.surnameUser = surnameUser;
    }



}
