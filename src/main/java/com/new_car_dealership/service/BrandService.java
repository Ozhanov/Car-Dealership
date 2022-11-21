package com.new_car_dealership.service;

import com.new_car_dealership.dto.BrandInputDto;
import com.new_car_dealership.entity.Brand;
import com.new_car_dealership.entity.User;

import java.util.List;

public interface BrandService {
    List<BrandInputDto> getAllBrand();

     void saveBrand(BrandInputDto dto);

     Brand getBrand(int id);

     void deleteBrand(int id);
}
