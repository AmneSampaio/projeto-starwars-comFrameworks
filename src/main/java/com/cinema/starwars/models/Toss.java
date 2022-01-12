package com.cinema.starwars.models;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
public class Toss {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private User user;

    private BigDecimal value;

    private LocalDateTime hourToss;

    @ManyToOne
    private Auction auction;

    public Toss() {
    }

    public Toss(BigDecimal value, LocalDateTime hourToss) {
        this.value = value;
        this.hourToss = hourToss;
    }

    public Long getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public LocalDateTime getHourToss() {
        return hourToss;
    }

    public void setHourToss(LocalDateTime hourToss) {
        this.hourToss = hourToss;
    }

    public Auction getAuction() {
        return auction;
    }

    @Override
    public String toString() {
        return "Toss{" +
                "id=" + id +
                ", user=" + user +
                ", value=" + value +
                ", hourToss=" + hourToss +
                ", auction=" + auction +
                '}';
    }
}
