package com.example.demo.controller;

import com.example.demo.entitites.Reservation;
import com.example.demo.services.ReservationService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;
@RequestMapping(path = "/api/reservations/")
@RestController
@Api(tags = "Reservation controller")
public class ReservationController {
    private ReservationService reservationService;

    public ReservationController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    @PostMapping
    public void addReservation(@RequestParam UUID id_flight, @RequestParam UUID id_client,
                          @RequestParam int numberOfPlace, @RequestParam String touristName){
        reservationService.addReservation(id_flight,id_client,numberOfPlace,touristName);
    }
    @DeleteMapping
    public void deleteReservation(@RequestParam UUID ID){
        reservationService.deleteReservation(ID);
    }
    @PutMapping
    public void updateReservation(@RequestBody Reservation newReservation, @RequestParam UUID ID){
        reservationService.updateReservation(newReservation,ID);
    }
    @GetMapping
    @ApiOperation(nickname = "getReservations", value = "returns reservations ")
    public List<Reservation> getAllReservations(){
        return reservationService.getAll();
    }
}
