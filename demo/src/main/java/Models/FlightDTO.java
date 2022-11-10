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

}
