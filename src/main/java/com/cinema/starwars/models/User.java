package com.cinema.starwars.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class User {
    @Id
    @GeneratedValue
    private Long id;

    private String email;

    private String name;

    @OneToMany
    private List<Toss> tosses;

    @ManyToOne
    @JoinColumn(name = "auction_id")
    private Auction auction;

    @OneToMany
    private List<Vehicle> vehicle;

    public User() {
    }

    public User(String email, String name) {
        this.email = email;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Toss> getTosses() {
        return tosses;
    }

    public Auction getAuction() {
        return auction;
    }

    public List<Vehicle> getVehicle() {
        return vehicle;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", tosses=" + tosses +
                ", auction=" + auction +
                ", vehicle=" + vehicle +
                '}';
    }
}
