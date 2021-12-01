package com.cinema.starwars.services;

import com.cinema.starwars.controllers.VehicleController;
import com.cinema.starwars.models.Garage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class VehicleService {

    @Autowired
    private VehicleController vehicleController;

    @Autowired
    private RestTemplate restTemplate;

    public Garage getGarage(){
        return restTemplate.getForObject("https://swapi.dev/api/vehicles", Garage.class);
    }


}
