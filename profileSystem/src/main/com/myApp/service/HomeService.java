package main.com.myApp.service;

import main.com.myApp.dao.UserDAO;
import main.com.myApp.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HomeService {
    @Autowired
    private UserDAO userDAO;

    public void saveUser(UserModel user){
        if(user.getFirstName().isEmpty()){
            throw new IllegalArgumentException("First Name should be added");
        }
        if(user.getLastName().isEmpty()){
            throw new IllegalArgumentException("Last Name should be added");
        }
        if(user.getEmail().isEmpty()){
            throw new IllegalArgumentException("E-mail should be added");
        }

        userDAO.save(user);
    }
}
