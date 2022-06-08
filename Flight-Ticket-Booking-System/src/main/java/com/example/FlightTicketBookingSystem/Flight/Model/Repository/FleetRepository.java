package com.example.FlightTicketBookingSystem.Flight.Model.Repository;

import com.example.FlightTicketBookingSystem.Flight.Model.Fleet;
import com.example.FlightTicketBookingSystem.User.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface FleetRepository extends JpaRepository<Fleet, Integer> {

}
