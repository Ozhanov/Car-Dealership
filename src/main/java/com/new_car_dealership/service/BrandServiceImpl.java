package com.new_car_dealership.service;

import com.new_car_dealership.dao.BrandDAO;
import com.new_car_dealership.dto.BrandInputDto;
import com.new_car_dealership.entity.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service

public class BrandServiceImpl implements BrandService{

    @Autowired
    private BrandDAO brandDAO;



    @Override
    @Transactional
    public List<BrandInputDto> getAllBrand() {
        return brandDAO.getAllBrand();
    }

    @Override
    @Transactional
    public void saveBrand(BrandInputDto dto) {
        brandDAO.saveBrand(dto);
    }

    @Override
    @Transactional
    public Brand getBrand(int id) {
        return brandDAO.getBrand(id);
    }

    @Override
    @Transactional
    public void deleteBrand(int id) {
        brandDAO.deleteBrand(id);
    }
}
