package com.vehiclesSystem.service;

import com.vehiclesSystem.dao.PlaneDAO;
import com.vehiclesSystem.models.Plane;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PlaneService {
    @Autowired
    private PlaneDAO planeDAO;

    public void savePlane(Plane plane){
        if(plane.getBrand().isEmpty()){
            throw new IllegalArgumentException("Brand should be added");
        }

        planeDAO.save(plane);
    }
}
