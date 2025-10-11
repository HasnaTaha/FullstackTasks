package com.vehiclesSystem.controller;

import com.vehiclesSystem.config.Config;
import com.vehiclesSystem.dao.DatabaseOperations;
import com.vehiclesSystem.models.Bike;
import com.vehiclesSystem.models.Vehicle;
import com.vehiclesSystem.service.BikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class BikeController implements VehicleController {

    private DatabaseOperations databaseOperations;

    @Autowired
    public BikeController(DatabaseOperations databaseOperations) {
        this.databaseOperations = databaseOperations;
    }

    @Override
    public void saveVehicle(Vehicle vehicle) {
        ApplicationContext context= new AnnotationConfigApplicationContext(Config.class);
        BikeService bikeService = (BikeService) context.getBean("bikeService");
        bikeService.saveBike((Bike) vehicle);
    }

    public void test() {
        System.out.println("test");
    }
}
