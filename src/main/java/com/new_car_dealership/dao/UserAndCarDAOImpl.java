package com.new_car_dealership.dao;

import com.new_car_dealership.dto.UserAndCar;
import com.new_car_dealership.dto.UserInputDto;
import com.new_car_dealership.entity.Brand;
import com.new_car_dealership.entity.Car;
import com.new_car_dealership.entity.Model;
import com.new_car_dealership.entity.User;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Transactional
@Repository
public class UserAndCarDAOImpl implements UserAndCarDAO{

    @Autowired
    private SessionFactory sessionFactory;

    @Autowired
    private UserAndCarDAO userAndCarDAO;



    @Override
    public List<UserAndCar> getAllUser() {
        Session session = sessionFactory.getCurrentSession();

        List<Object[]> cars = session.createNativeQuery(
                "select users.surname as user_surname,\n" +
                        "users.name as user_name\n" +
                        "from my_db.car car \n" +
                        "\tleft join my_db.user users on car.user_id = users.id\n" +
                        "    left join my_db.model models on car.model_id = models.id\n" +
                        "    left join my_db.brand brands on brands.id = models.brand_id\n" +
                        "   group by car.user_id having count(user_id) > 2;"
        ).list();

        List<UserAndCar> allUserDTos = new ArrayList<>();

        for(Object[] car : cars) {
            UserAndCar result = new UserAndCar();
            String userName = (String) car[0];
            String surnameUser = (String) car[1];



            result.setNameUser(userName);
            result.setSurnameUser(surnameUser);
            allUserDTos.add(result);
        }

        return allUserDTos;
    }

    @Override
    public void saveUser(UserAndCar dto) {

    }

    @Override
    public User getUser(int id) {
        return null;
    }

    @Override
    public void deleteUser(int id) {

    }
}
