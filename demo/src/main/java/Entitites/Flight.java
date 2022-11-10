package Entitites;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;
import java.util.UUID;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Flight{
    @Getter @Id @Setter @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    private UUID ID;
    @Getter @Setter
    private String destination; //oras
    @Getter @Setter
    private String departure; //oras
    @Getter @Setter
    private String dateDeparture;
    @Getter @Setter
    private String timeDeparture;
    @Getter @Setter
    private String airport;
    @Getter @Setter
    private int numberOfPlace;

    public Flight(String destination, String arrival, String dateDeparture, String timeDeparture, String airport, int numberOfPlace) {
        this.destination = destination;
        this.departure = arrival;
        this.dateDeparture = dateDeparture;
        this.timeDeparture = timeDeparture;
        this.airport = airport;
        this.numberOfPlace = numberOfPlace;
    }

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

}