package com.example.FlightTicketBookingSystem.User.Repository;

import com.example.FlightTicketBookingSystem.User.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Integer> {

    Optional<User> findUserByUserName(String username);
    Optional<User> findUserByEmail(String email);
}
