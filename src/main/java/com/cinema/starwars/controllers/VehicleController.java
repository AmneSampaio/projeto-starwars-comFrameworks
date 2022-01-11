package com.cinema.starwars.controllers;

import com.cinema.starwars.models.Garage;
import com.cinema.starwars.models.Vehicle;
import com.cinema.starwars.services.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    public Vehicle getOneVehicleFromGarage(@PathVariable int id){

        return vehicleService.getOneVehicleFromGarage(id);
    }

    // TODO endpoint que mostra os ids disponiveis
    /*public List<Strings> getAvailableIds() {


    }*/


}
