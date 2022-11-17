package com.example.demo.Repositories;

import com.example.demo.Entitites.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface FlightsRepository extends JpaRepository<Flight, UUID> {
}
