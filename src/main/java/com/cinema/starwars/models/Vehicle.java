package com.cinema.starwars.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Vehicle {

    @Id
    private Long id;
    private String name;
    private String model;
    private String cost_in_credits;
    private String url;

    public Vehicle() {
    }

    public Vehicle(String name, String model, String costInCredits) {
        this.name = name;
        this.model = model;
        this.cost_in_credits = costInCredits;
    }

    public Long getId() {
        String[] removeSlash = this.url.split("/");
        this.id = Long.parseLong(removeSlash[removeSlash.length-1]);
        return this.id;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public String getCostInCredits() {
        return this.cost_in_credits;
    }

    public String getUrl(){
        return this.url;
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
