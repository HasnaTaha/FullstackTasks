package com.vehiclesSystem.dao;

import com.vehiclesSystem.models.Plane;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.PreparedStatement;
import java.sql.SQLException;

@Component
public class PlaneDAO implements VehicleDAO{
    private final DatabaseOperations databaseOperations;

    @Autowired
    public PlaneDAO(DatabaseOperations databaseOperations) {
        this.databaseOperations = databaseOperations;
    }

    public void save(Plane plane) {
        //insert directly in DB
        String sql = "INSERT INTO plane (brand, type_id) VALUES (?, ?)";
        try (PreparedStatement preparedStatement = databaseOperations.connectToDatabase().prepareStatement(sql)) {
            preparedStatement.setString(1, plane.getBrand());
            preparedStatement.setString(2, plane.getType().getId());
            preparedStatement.executeUpdate();
            System.out.println("P;ane inserted successfully!");
        } catch (SQLException e) {
            throw new RuntimeException("Error inserting Plane", e);
        }
    }
}
