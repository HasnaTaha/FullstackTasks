package com.vehiclesSystem.dao;

import com.vehiclesSystem.models.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.PreparedStatement;
import java.sql.SQLException;

@Component
public class CarDAO implements VehicleDAO{
    private final DatabaseOperations databaseOperations;

    @Autowired
    public CarDAO(DatabaseOperations databaseOperations) {
        this.databaseOperations = databaseOperations;
    }

    public void save(Car car) {
        //insert directly in DB
        String sql = "INSERT INTO car (brand, type_id) VALUES (?, ?)";
        try (PreparedStatement preparedStatement = databaseOperations.connectToDatabase().prepareStatement(sql)) {
            preparedStatement.setString(1, car.getBrand());
            preparedStatement.setString(2, car.getType().getId());
            preparedStatement.executeUpdate();
            System.out.println("Car inserted successfully!");
        } catch (SQLException e) {
            throw new RuntimeException("Error inserting car", e);
        }
    }
}
