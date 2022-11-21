package com.new_car_dealership.dao.controller;


import com.new_car_dealership.dto.ModelInputDto;
import com.new_car_dealership.entity.Model;
import com.new_car_dealership.service.ModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ModelControll {

    @Autowired
    private ModelService modelService;

    @GetMapping("/models")
    public List<ModelInputDto> showAllModel(){
        List<ModelInputDto> allModel = modelService.getAllModel();

        return allModel;
    }

    @GetMapping("/models/{id}")
    public Model getModel(@PathVariable int id){
        Model model = modelService.getModel(id);
        return model;
    }

    @PutMapping("/models")
    public void addNewModel(@RequestBody ModelInputDto dto){
        modelService.saveModel(dto);
    }

    @PostMapping("/models")
    public void updateModel(@RequestBody ModelInputDto dto){
        modelService.saveModel(dto);

    }

    @DeleteMapping("/models/{id}")
    public String deleteModel(@PathVariable int id){
        Model model = modelService.getModel(id);

        modelService.deleteModel(id);
        return "Model with ID = " + id + " was deleted";
    }

}
