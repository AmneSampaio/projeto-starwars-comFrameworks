package com.cinema.starwars.controllers;

import com.cinema.starwars.models.Garage;
import com.cinema.starwars.models.Vehicle;
import com.cinema.starwars.services.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/starwars")
public class VehicleController {

    @Autowired
    private VehicleService vehicleService;

    @GetMapping("all")
    public Garage getEntireGarage(){
        return vehicleService.getEntireGarage();
    }

    @GetMapping("one/{id}")
    public Vehicle getOneVehicleFromGarage(@PathVariable Long id){

        return vehicleService.getOneVehicleFromGarage(id);
    }


}