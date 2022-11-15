package Models;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FlightDTO {
    @Getter @Id @Setter @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    private UUID ID;
    @Getter @Setter
    private String departure; //oras
    @Getter @Setter
    private String arrival; //oras
    @Getter @Setter
    private String depDate;
    @Getter @Setter
    private String arrDate;
    @Getter @Setter
    private String depTime;
    @Getter @Setter
    private String arrTime;
    @Getter @Setter
    private String depAirport;
    @Getter @Setter
    private String arrAirport;
    @Getter @Setter
    private String duration;
    @Getter @Setter
    private String airline;
    @Getter @Setter
    private int totalSits;
    @Getter @Setter
    private int availableSits;
    @Getter @Setter
    private int prince;
}
