package com.new_car_dealership.dao;

import com.new_car_dealership.dto.BrandInputDto;
import com.new_car_dealership.entity.Brand;

import java.util.List;

public interface BrandDAO {
    public List<BrandInputDto> getAllBrand();

    public void saveBrand(BrandInputDto dto);

    public Brand getBrand(int id);

    public void deleteBrand(int id);
}
