package com.new_car_dealership.dao.controller;

import com.new_car_dealership.dto.BrandInputDto;
import com.new_car_dealership.entity.Brand;
import com.new_car_dealership.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class BrandController {

    @Autowired
    private BrandService brandService;

    @GetMapping("/brands")
    public List<BrandInputDto> showAllBrand(){
        return brandService.getAllBrand();

    }

    @GetMapping("/brands/{id}")
    public Brand getBrand(@PathVariable int id){

        return brandService.getBrand(id);
    }

    @PutMapping("/brands")
    public void addNewBrand(@RequestBody BrandInputDto dto){
        brandService.saveBrand(dto);

    }

    @PostMapping("/brands")
    public void updateBrand(@RequestBody BrandInputDto dto){
        brandService.saveBrand(dto);

    }

    @DeleteMapping("/brands/{id}")
    public String deleteBrand(@PathVariable int id){
        Brand brand = brandService.getBrand(id);

        brandService.deleteBrand(id);
        return "Brand with ID = " + id + " was deleted";
    }

}
