package com.cinema.starwars.models;

public class Vehicle {

    private String name;
    private String model;

    public Vehicle() {
    }

    public Vehicle(String name, String model) {
        this.name = name;
        this.model = model;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                ", name='" + name + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
