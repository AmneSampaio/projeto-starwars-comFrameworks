package com.cinema.starwars.models;

public class Vehicle {

    private Long id;
    private String name;
    private String model;

    public Vehicle() {
    }

    public Vehicle(String name, String model) {
        this.name = name;
        this.model = model;
    }

    public Vehicle(Long id, String name, String model) {
        this.id = id;
        this.name = name;
        this.model = model;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
                "id=" + id +
                ", name='" + name + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
