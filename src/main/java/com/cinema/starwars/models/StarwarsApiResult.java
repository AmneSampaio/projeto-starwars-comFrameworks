package com.cinema.starwars.models;

import java.util.List;

public class StarwarsApiResult {

    private List<Vehicle> results;
    private String next;

    public StarwarsApiResult() {
    }

    public List<Vehicle> getResults() {
        return results;
    }

    public String getNext() {
        return next;
    }
}
