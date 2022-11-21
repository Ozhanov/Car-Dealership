package com.new_car_dealership.dao;

import com.new_car_dealership.dto.ModelInputDto;
import com.new_car_dealership.entity.Brand;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.new_car_dealership.entity.Model;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ModelDAOImpl implements ModelDAO{

    @Autowired
    private SessionFactory sessionFactory;

    @Autowired
    private BrandDAO brandDAO;


    @Override
    public List<ModelInputDto> getAllModel() {
        Session session = sessionFactory.getCurrentSession();
        List<Model> allModel = session.createQuery("from Model", Model.class).getResultList();
        List<ModelInputDto> allModelDTO = new ArrayList<>();

        for (Model m: allModel){
            ModelInputDto result = new ModelInputDto();
            result.setName(m.getName());
            result.setBrand_id(m.getId());
            allModelDTO.add(result);
        }
        return allModelDTO;
    }

    @Override
    public void saveModel(ModelInputDto dto) {
        Brand brand = brandDAO.getBrand(dto.getBrand_id());

        Model model = new Model();
        model.setName(dto.getName());
        model.setBrand(brand);

        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(model);
    }


    @Override
    public Model getModel(int id) {
        Session session = sessionFactory.getCurrentSession();

        Model model = session.get(Model.class, id);
        return model;
    }

    @Override
    public void deleteModel(int id) {
        Session session = sessionFactory.getCurrentSession();

        Query<Model> queue = session.createQuery("delete from Model " + "where id =:modelId");
        queue.setParameter("modelId", id);
        queue.executeUpdate();
    }
}
