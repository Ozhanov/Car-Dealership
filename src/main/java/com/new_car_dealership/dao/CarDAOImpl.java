package com.new_car_dealership.dao;

import com.new_car_dealership.dto.CarInputDto;
import com.new_car_dealership.entity.Car;
import com.new_car_dealership.entity.Model;
import com.new_car_dealership.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDAOImpl implements CarDAO{

    @Autowired
    private SessionFactory sessionFactory;

    @Autowired
    private ModelDAO modelDAO;

    @Autowired
    private  UserDAO userDAO;

    @Override
    public List<CarInputDto> getAllCar() {
        Session session = sessionFactory.getCurrentSession();
        List<Car> allCar = session.createQuery("from Car", Car.class).getResultList();
        List<CarInputDto> allCarDTO = new ArrayList<>();

        for (Car c: allCar){
            CarInputDto result = new CarInputDto();
            result.setId(c.getId());
            result.setName(c.getName());
            result.setColor(c.getColor());
            result.setVolume(c.getVolume());
            result.setYear(c.getYear());
            result.setModelID(c.getId());
            result.setUserID(c.getId());

            allCarDTO.add(result);
        }
        return allCarDTO;
    }

    @Override
    public void saveCar(CarInputDto dto) {
        Model model = modelDAO.getModel(dto.modelID);
        User user = userDAO.getUser(dto.userID);
        Car car = new Car();
        car.setId(dto.getId());
        car.setName(dto.getName());
        car.setColor(dto.getColor());
        car.setVolume(dto.getVolume());
        car.setYear(dto.getYear());
        car.setUser(user);
        car.setModel(model);
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(car);

    }

    @Override
    public Car getCar(int id) {
        Session session = sessionFactory.getCurrentSession();

        Car car = session.get(Car.class, id);
        return car;
    }

    @Override
    public void deleteCar(int id) {
        Session session = sessionFactory.getCurrentSession();

        Query<Car> queue = session.createQuery("delete from Car " + "where id =:carId");
        queue.setParameter("carId", id);
        queue.executeUpdate();
    }
}
