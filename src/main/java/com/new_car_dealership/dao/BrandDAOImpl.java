package com.new_car_dealership.dao;

import com.new_car_dealership.dto.BrandInputDto;
import com.new_car_dealership.entity.Brand;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class BrandDAOImpl implements BrandDAO{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<BrandInputDto> getAllBrand() {
        Session session = sessionFactory.getCurrentSession();
        List<Brand> allBrand = session.createQuery("from Brand", Brand.class).getResultList();
        List<BrandInputDto> allBrandDAO = new ArrayList<>();

        for (Brand b: allBrand){
            BrandInputDto result = new BrandInputDto();
            result.setName(b.getName());
            result.setId(b.getId());
            allBrandDAO.add(result);
        }
        return allBrandDAO;
    }

    @Override
    public void saveBrand(BrandInputDto dto) {
        Brand brand = new Brand();
        brand.setName(dto.getName());
        Session session = sessionFactory.getCurrentSession();

        session.saveOrUpdate(brand);
    }

    @Override
    public Brand getBrand(int id) {
        Session session = sessionFactory.getCurrentSession();

        Brand brand = session.get(Brand.class, id);
        return brand;
    }

    @Override
    public void deleteBrand(int id) {
        Session session = sessionFactory.getCurrentSession();

        Query<Brand> queue = session.createQuery("delete from Brand " + "where id =:brandId");
        queue.setParameter("brandId", id);
        queue.executeUpdate();
    }
}
