package com.vehiclesSystem.controller;

import com.vehiclesSystem.config.Config;
import com.vehiclesSystem.dao.DatabaseOperations;
import com.vehiclesSystem.models.Plane;
import com.vehiclesSystem.models.Vehicle;
import com.vehiclesSystem.service.PlaneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class PlaneController implements VehicleController{
    private DatabaseOperations databaseOperations;

    @Autowired
    public PlaneController(DatabaseOperations databaseOperations) {
        this.databaseOperations = databaseOperations;
    }
    @Override
    public void saveVehicle(Vehicle vehicle) {
        databaseOperations.connectToDatabase();
        ApplicationContext context= new AnnotationConfigApplicationContext(Config.class);
        PlaneService planeService = (PlaneService) context.getBean("planeService");
        planeService.savePlane((Plane) vehicle);
    }
}
