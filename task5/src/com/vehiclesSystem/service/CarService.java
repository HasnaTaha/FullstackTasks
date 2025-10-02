package com.vehiclesSystem.service;

import com.vehiclesSystem.dao.CarDAO;
import com.vehiclesSystem.models.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CarService {
    @Autowired
    private CarDAO carDAO;

    public void saveCar(Car car){
        if(car.getBrand().isEmpty()){
            throw new IllegalArgumentException("Brand should be added");
        }

        carDAO.save(car);
    }
}
