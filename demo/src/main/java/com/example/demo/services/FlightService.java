package com.example.demo.services;

import com.example.demo.entitites.Flight;
import com.example.demo.repositories.FlightsRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class FlightService {
    private FlightsRepository flightRepository;

    public FlightService(FlightsRepository flightRepository) {
        this.flightRepository = flightRepository;
    }

    public void addFlight(String destination, String departure, String dateOfDeparture, String timeOfDeparture, String airport, String numberOfPlace){
        Flight flight = new Flight(destination,departure,dateOfDeparture,timeOfDeparture,airport,numberOfPlace);
        flightRepository.save(flight);
    }
    public void deleteFlight(UUID ID){
        flightRepository.deleteById(ID);
    }
    public void updateFlight(Flight newFlight,UUID ID){
        Flight flight = flightRepository.findById(ID).orElseThrow();
        flight.setDestination(newFlight.getDeparture());
        flight.setDeparture(newFlight.getDeparture());
        flight.setDateDeparture(newFlight.getDateDeparture());
        flight.setTimeDeparture(newFlight.getTimeDeparture());
        flight.setAirport(newFlight.getAirport());
        flight.setNumberOfPlace(newFlight.getNumberOfPlace());
        flightRepository.save(flight);
    }
    public List<Flight> getAll(){
        return flightRepository.findAll();
    }
}
