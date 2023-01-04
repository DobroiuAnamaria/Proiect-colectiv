package com.example.demo.controller;

import com.example.demo.entitites.Flight;
import com.example.demo.services.FlightService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;
@RequestMapping(path = "/api/flight/")
@RestController
@Api(tags = "Flight controller")
public class FlightController {
    private final FlightService flightService;

    public FlightController(FlightService flightService) {
        this.flightService = flightService;
    }

    @PostMapping
    public void addFlight(@RequestParam String destination,@RequestParam String departure,
                          @RequestParam String dateOfDeparture,@RequestParam String timeOfDeparture,
                          @RequestParam String airport,@RequestParam String numberOfPlace){
        flightService.addFlight(destination,departure,dateOfDeparture,timeOfDeparture,airport,numberOfPlace);
    }
    @DeleteMapping
    public void deleteFlight(@RequestParam UUID ID){
        flightService.deleteFlight(ID);
    }
    @PutMapping
    public void updateFlight(@RequestBody Flight newFlight,@RequestParam UUID ID){
        flightService.updateFlight(newFlight,ID);
    }
    @GetMapping
    @ApiOperation(nickname = "getFlights", value = "returns flights ")
    public List<Flight> getAllFlights(){
       return flightService.getAll();
    }

}
