package com.new_car_dealership.dto;

public class BrandInputDto {

    public String name;
    public int id;

    public BrandInputDto(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public BrandInputDto(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
