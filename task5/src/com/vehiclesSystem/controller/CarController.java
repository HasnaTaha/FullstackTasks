package com.vehiclesSystem.controller;

import com.vehiclesSystem.config.Config;
import com.vehiclesSystem.dao.DatabaseOperations;
import com.vehiclesSystem.models.Car;
import com.vehiclesSystem.models.Vehicle;
import com.vehiclesSystem.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class CarController implements VehicleController{
    private DatabaseOperations databaseOperations;

    @Autowired
    public CarController(DatabaseOperations databaseOperations) {
        this.databaseOperations = databaseOperations;
    }
    @Override
    public void saveVehicle(Vehicle vehicle) {
        databaseOperations.connectToDatabase();
        ApplicationContext context= new AnnotationConfigApplicationContext(Config.class);
        CarService carService = (CarService) context.getBean("carService");
        carService.saveCar((Car)vehicle);
    }
}
