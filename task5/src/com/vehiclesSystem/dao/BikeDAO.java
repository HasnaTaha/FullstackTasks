package com.vehiclesSystem.dao;

import com.vehiclesSystem.models.Bike;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.PreparedStatement;
import java.sql.SQLException;

@Component
public class BikeDAO implements VehicleDAO {
    private final DatabaseOperations databaseOperations;

    @Autowired
    public BikeDAO(DatabaseOperations databaseOperations) {
        this.databaseOperations = databaseOperations;
    }

    public void save(Bike bike) {
        //insert directly in DB
        String sql = "INSERT INTO bike (brand, type_id) VALUES (?, ?)";
        try (PreparedStatement preparedStatement = databaseOperations.connectToDatabase().prepareStatement(sql)) {
            preparedStatement.setString(1, bike.getBrand());
            preparedStatement.setString(2, bike.getType().getId());
            preparedStatement.executeUpdate();
            System.out.println("Bike inserted successfully!");
        } catch (SQLException e) {
            throw new RuntimeException("Error inserting bike", e);
        }
    }
}
