package com.new_car_dealership.dao;

import com.new_car_dealership.dto.UserInputDto;
import com.new_car_dealership.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserDAOImpl implements UserDAO{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<UserInputDto> getAllUser() {
        Session session = sessionFactory.getCurrentSession();
        List<User> allUser = session.createQuery("from User", User.class).getResultList();
        List<UserInputDto> allUserDTo = new ArrayList<>();

        for (User u: allUser){
            UserInputDto result = new UserInputDto();
            result.setId(u.getId());
            result.setName(u.getName());
            result.setSurname(u.getSurname());
            result.setAge(u.getAge());
            result.setYear(u.getYear());

            allUserDTo.add(result);
        }
        return allUserDTo;
    }

    @Override
    public void saveUser(UserInputDto dto) {
        User user = new User();
        user.setId(dto.getId());
        user.setName(dto.getName());
        user.setSurname(dto.getSurname());
        user.setAge(dto.getAge());
        user.setYear(dto.getYear());

        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(user);

    }

    @Override
    public User getUser(int id) {
        Session session = sessionFactory.getCurrentSession();
        User user = session.get(User.class, id);
        return user;
    }

    @Override
    public void deleteUser(int id) {
         Session session = sessionFactory.getCurrentSession();;
        Query<User> query = session.createQuery("delete from User " + "where  id =:userId");
        query.setParameter("userId", id);
        query.executeUpdate();
    }
}
