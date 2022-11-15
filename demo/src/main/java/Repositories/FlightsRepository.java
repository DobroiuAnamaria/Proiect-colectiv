package Repositories;

import Entitites.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface FlightsRepository extends JpaRepository<Flight, UUID> {
}
