package com.cinema.starwars.services;

import com.cinema.starwars.controllers.AuctionController;
import com.cinema.starwars.controllers.VehicleController;
import com.cinema.starwars.models.Auction;
import com.cinema.starwars.models.Vehicle;
import com.cinema.starwars.models.dto.AuctionDTO;
import com.cinema.starwars.repositories.AuctionRepository;
import org.apache.logging.log4j.message.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class AuctionService{

    @Autowired
    private AuctionRepository auctionRepository;

    @Autowired
    private VehicleService vehicleService;

    public List<Auction> getAllAuctions() throws Exception {
        try {
            return auctionRepository.findAll();
        } catch (Exception e) {
            throw new Exception("There are no Auctions available.");
        }

    }

    ;

  /*  public Auction getOneAuction(Long id) throws Exception {
        Auction auctionById = auctionRepository.findOneAuction(id);
        try {
            return auctionById;
        } catch (Exception e) {
            throw new Exception("This id doesn't match any auction");
        }

    }*/

   /* public Auction createAuction(Auction auction) throws Exception {
        Auction auctionById = auctionRepository.findOneAuction(auction.getId());
        Auction newAuction;
        if (auctionById == null) {
            Long vehicleId = auction.getVehicle().getId();
            Vehicle vehicle = vehicleService.getOneVehicleFromGarage(vehicleId);

            newAuction = new Auction(auction.getStart(),
                    auction.getFinish(),
                    auction.getStartingPrice(),
                    auction.getVehicle());
        } else {
            throw new Exception("This auction already exists");
        }
        return newAuction;
    }*/


}
