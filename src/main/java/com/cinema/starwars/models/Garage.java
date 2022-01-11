package com.cinema.starwars.models;

import java.util.ArrayList;
import java.util.List;

public class Garage {

    private List<Vehicle> results;

    public Garage() {
    }

    public Garage(List<Vehicle> results) {
        this.results = results;
    }

    public List<Vehicle> getResults() {
        return results;
    }

    public void setResults(List<Vehicle> results) {
        this.results = results;
    }

    public void appendResults(List<Vehicle> results) {
        List<Vehicle> biggerGarage = new ArrayList<>();
        if (this.results != null) {
            biggerGarage.addAll(this.results);
        }
        biggerGarage.addAll(results);
        this.results = biggerGarage;
    }

    @Override
    public String toString() {
        return "Garage{" +
                "results=" + results +
                '}';
    }
}
