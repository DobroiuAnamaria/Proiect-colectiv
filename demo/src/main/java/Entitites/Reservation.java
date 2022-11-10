package Entitites;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Reservation{
    @Getter @Id @Setter @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    private UUID ID;
    @Getter @Setter
    private int id_flight;
    @Getter @Setter
    private int id_client;
    @Getter @Setter
    private int numberOfPlace;
    @Getter @Setter
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
}
