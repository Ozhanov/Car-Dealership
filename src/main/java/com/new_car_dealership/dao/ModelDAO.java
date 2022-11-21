package com.new_car_dealership.dao;

import com.new_car_dealership.dto.ModelInputDto;
import com.new_car_dealership.entity.Model;

import java.util.List;

public interface ModelDAO {
    public List<ModelInputDto> getAllModel();

    public void saveModel(ModelInputDto dto);

    public Model getModel(int id);

    public void deleteModel(int id);
}
