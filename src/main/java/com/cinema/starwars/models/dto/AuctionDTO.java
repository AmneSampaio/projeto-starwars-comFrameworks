package com.cinema.starwars.models.dto;

import com.cinema.starwars.models.Toss;
import com.cinema.starwars.models.User;
import com.cinema.starwars.models.Vehicle;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class AuctionDTO {

    @Id
    @GeneratedValue
    private Long id;

    private LocalDateTime start;

    private LocalDateTime finish;

    private BigDecimal startingPrice;

    @ManyToOne
    private Vehicle vehicle;

    @ManyToOne
    private User user;

    @OneToMany
    private List<Toss> tosses = new ArrayList<>();

    public AuctionDTO() {
    }

    public AuctionDTO(LocalDateTime start, LocalDateTime finish, BigDecimal startingPrice, Vehicle vehicle) {
        this.start = start;
        this.finish = finish;
        this.startingPrice = startingPrice;
        this.vehicle = vehicle;
    }

    public Long getId() {
        return id;
    }

    public LocalDateTime getStart() {
        return start;
    }

    public void setStart(LocalDateTime start) {
        this.start = start;
    }

    public LocalDateTime getFinish() {
        return finish;
    }

    public void setFinish(LocalDateTime finish) {
        this.finish = finish;
    }

    public BigDecimal getStartingPrice() {
        return startingPrice;
    }

    public void setStartingPrice(BigDecimal startingPrice) {
        this.startingPrice = startingPrice;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Toss> getTosses() {
        return tosses;
    }

    public void setTosses(List<Toss> tosses) {
        this.tosses = tosses;
    }

}
