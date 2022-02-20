package com.cinema.starwars.controllers;

import com.cinema.starwars.models.Auction;
import com.cinema.starwars.services.AuctionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/auctions")
public class AuctionController {

    @Autowired
    private AuctionService auctionService;

    @GetMapping("/allAuctions")
    public List<Auction> getAllAuctions() throws Exception {
        return auctionService.getAllAuctions();
    }

    /*@GetMapping("/{id}")
    public Auction getOneAuction(@PathVariable Long id) throws Exception {
        return auctionService.getOneAuction(id);
    }*/

   /* @PostMapping("/create")
    public Auction createAuction(@RequestBody Auction auction) throws Exception {
        return auctionService.createAuction(auction);
    }*/
}
