package com.cinema.starwars.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Vehicle {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String model;
    private String cost_in_credits;

    public Vehicle() {
    }

    public Vehicle(String name, String model, String cost_in_credits) {
        this.name = name;
        this.model = model;
        this.cost_in_credits = cost_in_credits;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public String getCost_in_credits() {
        return this.cost_in_credits;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                ", name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", cost_in_credits=" + cost_in_credits +
                '}';
    }
}
