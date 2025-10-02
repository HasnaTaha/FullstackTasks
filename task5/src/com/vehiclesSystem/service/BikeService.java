package com.vehiclesSystem.service;

import com.vehiclesSystem.dao.BikeDAO;
import com.vehiclesSystem.models.Bike;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BikeService {
    @Autowired
    private BikeDAO bikeDAO;

    public void saveBike(Bike bike){
        if(bike.getBrand().isEmpty()){
            throw new IllegalArgumentException("Brand should be added");
        }

        bikeDAO.save(bike);
    }
}
