package com.new_car_dealership.dto;

public class ModelInputDto {
    private String name;
    private int brand_id;

    public ModelInputDto (){

    }


    public int getBrand_id() {
        return brand_id;
    }

    public void setBrand_id(int brand_id) {
        this.brand_id = brand_id;
    }

    public ModelInputDto(String name, int brand) {
        this.name = name;
        this.brand_id = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "ModelInputDto{" +
                "name='" + name + '\'' +
                ", brand_id=" + brand_id +
                '}';
    }
}
