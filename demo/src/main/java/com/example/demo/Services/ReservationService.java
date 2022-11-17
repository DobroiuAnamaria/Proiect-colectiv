package com.example.demo.Services;


import com.example.demo.Entitites.Reservation;
import com.example.demo.Repositories.ReservationsRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ReservationService {
    private ReservationsRepository reservationsRepository;

    public ReservationService(ReservationsRepository reservationsRepository) {
        this.reservationsRepository = reservationsRepository;
    }

    public void addReservation(UUID id_flight, UUID id_client, int numberOfPlace, String touristName){
       Reservation reservation = new Reservation(id_flight,id_client,numberOfPlace,touristName);
       reservationsRepository.save(reservation);
    }
    public void deleteReservation(UUID ID){
        reservationsRepository.deleteById(ID);
    }
    public void updateReservation(Reservation newReservation,UUID ID){
        Reservation reservation = reservationsRepository.findById(ID).orElseThrow();
        reservation.setId_client(newReservation.getId_client());
        reservation.setId_flight(newReservation.getId_flight());
        reservation.setTouristName(newReservation.getTouristName());
        reservation.setNumberOfPlace(newReservation.getNumberOfPlace());
        reservationsRepository.save(reservation);
    }
    public List<Reservation> getAll(){
        return reservationsRepository.findAll();
    }
}
