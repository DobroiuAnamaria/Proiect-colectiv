package com.example.demo.Entitites;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.UUID;

@Entity
@NoArgsConstructor
@Table(name="Reservations")
public class Reservation{
    @Getter @Id @Setter @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    private UUID ID;
    @Column(name="ID Flight")
    @Getter  @Setter @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    private UUID id_flight;
    @Column(name="ID Client")
    @Getter @Setter @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    private UUID id_client;
    @Column(name="Number of Place")
    @Getter @Setter
    private int numberOfPlace;
    @Getter @Setter
    @Column(name="Tourist Name")
    private String touristName;
    @Override
    public String toString() {
        return "Rezervation{" +
                "id_flight=" + id_flight +
                ", id_client=" + id_client +
                ", numberOfPlace=" + numberOfPlace +
                ", touristName='" + touristName + '\'' +
                '}';
    }

    public Reservation(UUID id_flight, UUID id_client, int numberOfPlace, String touristName) {
        this.id_flight = id_flight;
        this.id_client = id_client;
        this.numberOfPlace = numberOfPlace;
        this.touristName = touristName;
    }

    public Reservation(UUID ID, UUID id_flight, UUID id_client, int numberOfPlace, String touristName) {
        this.ID = ID;
        this.id_flight = id_flight;
        this.id_client = id_client;
        this.numberOfPlace = numberOfPlace;
        this.touristName = touristName;
    }
}
