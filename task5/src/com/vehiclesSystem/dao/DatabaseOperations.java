package com.vehiclesSystem.dao;

import com.vehiclesSystem.models.Vehicle;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Component
@Getter
@Setter
public class DatabaseOperations {

    @Value("${database.url}")
    private String url;

    @Value("${database.password}")
    private String password;

    @Value("${database.username}")
    private String username;

    private Connection connection;

    public Connection  connectToDatabase(){
        try {
            if (connection == null || connection.isClosed()) {
                Class.forName("com.mysql.cj.jdbc.Driver");
                connection = DriverManager.getConnection(url, username, password);
                System.out.println("Connected to DB successfully.");
            }
        } catch (Exception e) {
            throw new RuntimeException("Error connecting to DB", e);
        }
        return connection;
    }
    public void disconnectFromDatabase(){
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
                System.out.println("Disconnected from DB");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public Vehicle save(Vehicle vehicle){
        return vehicle;
    }


}
