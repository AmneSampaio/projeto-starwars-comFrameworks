package com.cinema.starwars.repositories;

import com.cinema.starwars.models.Auction;
import com.cinema.starwars.models.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface VehicleRepository extends JpaRepository<Vehicle, Long> {
}
