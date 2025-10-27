package main.com.myApp.dao;

import main.com.myApp.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.PreparedStatement;
import java.sql.SQLException;

@Component
public class UserDAO {
    private final DatabaseOperations databaseOperations;

    @Autowired
    public UserDAO(DatabaseOperations databaseOperations) {
        this.databaseOperations = databaseOperations;
    }

    public void save(UserModel user) {
        //insert directly in DB
        String sql = "INSERT INTO user (firstName, lastName, city,email, birthdate) VALUES (?,?,?,?,?)";
        try (PreparedStatement preparedStatement = databaseOperations.connectToDatabase().prepareStatement(sql)) {
            preparedStatement.setString(1, user.getFirstName());
            preparedStatement.setString(2, user.getLastName());
            preparedStatement.setString(3, user.getCity());
            preparedStatement.setString(4, user.getEmail());
            preparedStatement.setString(5, user.getBirthDate().toString());
            preparedStatement.executeUpdate();
            System.out.println("user inserted successfully!");
        } catch (SQLException e) {
            throw new RuntimeException("Error inserting user", e);
        }
    }
}
