package com.example.demo.repositories;

import com.example.demo.entitites.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface ReservationsRepository extends JpaRepository<Reservation, UUID> {
}
