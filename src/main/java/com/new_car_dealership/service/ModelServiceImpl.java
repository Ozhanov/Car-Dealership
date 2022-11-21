package com.new_car_dealership.service;

import com.new_car_dealership.dao.ModelDAO;
import com.new_car_dealership.dto.ModelInputDto;
import com.new_car_dealership.entity.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ModelServiceImpl implements ModelService{

    @Autowired
    private ModelDAO modelDAO;

    @Override
    @Transactional
    public List<ModelInputDto> getAllModel() {

        return modelDAO.getAllModel();
    }

    @Override
    @Transactional
    public void saveModel(ModelInputDto dto) {
        modelDAO.saveModel(dto);
    }

    @Override
    @Transactional(readOnly = true)
    public Model getModel(int id) {
        return modelDAO.getModel(id);
    }

    @Override
    @Transactional
    public void deleteModel(int id) {
       modelDAO.deleteModel(id);
    }
}
