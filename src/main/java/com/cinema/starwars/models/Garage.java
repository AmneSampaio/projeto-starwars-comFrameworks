package com.cinema.starwars.models;

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

    @Override
    public String toString() {
        return "Garage{" +
                "results=" + results +
                '}';
    }
}
