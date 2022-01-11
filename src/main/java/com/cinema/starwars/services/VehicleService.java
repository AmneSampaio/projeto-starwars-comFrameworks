package com.cinema.starwars.services;

import com.cinema.starwars.controllers.VehicleController;
import com.cinema.starwars.models.Garage;
import com.cinema.starwars.models.StarwarsApiResult;
import com.cinema.starwars.models.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class VehicleService {

    @Autowired
    private VehicleController vehicleController;

    @Autowired
    private RestTemplate restTemplate;
    String url = "https://swapi.dev/api/vehicles/";

    public Garage getEntireGarage() {
        Garage biggerGarage = new Garage();
        StarwarsApiResult apiResult = restTemplate.getForObject(url, StarwarsApiResult.class);
        biggerGarage.appendResults(apiResult.getResults());

        String nextPage = apiResult.getNext();

        while (nextPage != null) {
            apiResult = restTemplate.getForObject(nextPage, StarwarsApiResult.class);
            nextPage = apiResult.getNext();
            if (nextPage != null) {
                biggerGarage.appendResults(apiResult.getResults());
            }
        }

        return biggerGarage;

    }

    public Vehicle getOneVehicleFromGarage(int id) {
        return restTemplate.getForObject(url + id, Vehicle.class);
    }


}
