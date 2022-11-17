package com.example.demo.Models;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;

@Data
@NoArgsConstructor
public class FlightDTO {
    @Getter @Id @Setter @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    private UUID ID;
    @Getter
    @Setter
    private String destination; //oras
    @Getter @Setter
    private String departure; //oras
    @Getter @Setter
    private String dateDeparture;
    @Getter @Setter
    private String timeDeparture;
    @Getter @Setter
    private String airport;

    public FlightDTO(String destination, String departure, String dateDeparture, String timeDeparture, String airport) {
        this.destination = destination;
        this.departure = departure;
        this.dateDeparture = dateDeparture;
        this.timeDeparture = timeDeparture;
        this.airport = airport;
    }
}
