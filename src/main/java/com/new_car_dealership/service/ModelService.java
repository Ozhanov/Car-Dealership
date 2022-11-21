package com.new_car_dealership.service;

import com.new_car_dealership.dto.ModelInputDto;
import com.new_car_dealership.entity.Model;
import com.new_car_dealership.entity.User;

import java.util.List;

public interface ModelService {
    public List<ModelInputDto> getAllModel();

    public void saveModel(ModelInputDto dto);

    public Model getModel(int id);

    public void deleteModel(int id);
}
