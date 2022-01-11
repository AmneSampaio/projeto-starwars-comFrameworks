package com.cinema.starwars.services;

import com.cinema.starwars.controllers.VehicleController;
import com.cinema.starwars.models.Garage;
import com.cinema.starwars.models.LineUp;
import com.cinema.starwars.models.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class VehicleService {

    @Autowired
    private VehicleController vehicleController;

    @Autowired
    private RestTemplate restTemplate;
    String url = "https://swapi.dev/api/vehicles/";

    public Garage getEntireGarage() {
        Garage biggerGarage = new Garage();
        Garage garage = restTemplate.getForObject(url, Garage.class);
        biggerGarage.appendResults(garage.getResults());
        LineUp eachPage = restTemplate.getForObject(url, LineUp.class);
        String nextPage = eachPage.getNextPage().toString();
        //List<String> allPages = new ArrayList<>();

        while (!nextPage.isEmpty()) {
            String newUrl = url + nextPage;
            garage = restTemplate.getForObject(newUrl, Garage.class);
            eachPage = restTemplate.getForObject(newUrl, LineUp.class);
            nextPage = eachPage.getNextPage().toString();
            if (!nextPage.isEmpty()) {
                biggerGarage.appendResults(garage.getResults());
            }
        }

        return biggerGarage;

    }

    public Vehicle getOneVehicleFromGarage(int id) {
        return restTemplate.getForObject(url + id, Vehicle.class);
    }


}
