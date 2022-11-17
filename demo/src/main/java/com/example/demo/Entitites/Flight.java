package com.example.demo.Entitites;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Objects;
import java.util.UUID;
@Entity
@Table(name="Flights")
@NoArgsConstructor
public class Flight{
    @Getter @Id @Setter @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    private UUID ID;
    @Getter @Setter
    @Column(name="Destination")
    private String destination; //oras
    @Getter @Setter
    @Column(name="Departure")
    private String departure; //oras
    @Getter @Setter
    @Column(name="Date of Departure")
    private String dateDeparture;
    @Getter @Setter
    @Column(name="Time of Departure")
    private String timeDeparture;
    @Getter @Setter
    @Column(name="Airport")
    private String airport;
    @Getter @Setter
    @Column(name="Number of Place")
    private String numberOfPlace;
    @Override
    public String toString() {
        return "The flight's dates:" +
                "Departure: " + destination + " " +
                "| Arrival: " + departure + '\n' +
                "| Date of departure: " + dateDeparture + " " +
                "| Time of departure: " + timeDeparture + " " +
                "| Airport: " + airport + '\n' +
                "| Number of place :" + numberOfPlace +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return numberOfPlace == flight.numberOfPlace && Objects.equals(destination, flight.destination) && Objects.equals(departure, flight.departure) && Objects.equals(dateDeparture, flight.dateDeparture) && Objects.equals(timeDeparture, flight.timeDeparture) && Objects.equals(airport, flight.airport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(destination, departure, dateDeparture, timeDeparture, airport, numberOfPlace);
    }

    public Flight(String destination, String departure, String dateDeparture, String timeDeparture, String airport, String numberOfPlace) {
        this.destination = destination;
        this.departure = departure;
        this.dateDeparture = dateDeparture;
        this.timeDeparture = timeDeparture;
        this.airport = airport;
        this.numberOfPlace = numberOfPlace;
    }

    public Flight(UUID ID, String destination, String departure, String dateDeparture, String timeDeparture, String airport, String numberOfPlace) {
        this.ID = ID;
        this.destination = destination;
        this.departure = departure;
        this.dateDeparture = dateDeparture;
        this.timeDeparture = timeDeparture;
        this.airport = airport;
        this.numberOfPlace = numberOfPlace;
    }
}