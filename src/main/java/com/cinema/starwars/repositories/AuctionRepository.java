package com.cinema.starwars.repositories;

import com.cinema.starwars.models.Auction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AuctionRepository extends JpaRepository<Auction, Long> {
    //Auction findOneAuction(Long id);
}
