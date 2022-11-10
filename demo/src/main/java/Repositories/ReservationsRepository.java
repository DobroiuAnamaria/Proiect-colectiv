package Repositories;

import Entitites.Client;
import Entitites.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ReservationsRepository extends JpaRepository<Reservation, UUID> {
}
