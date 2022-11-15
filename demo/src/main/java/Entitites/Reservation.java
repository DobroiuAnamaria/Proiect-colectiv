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

    public UUID getID() {
        return ID;
    }

    public void setID(UUID ID) {
        this.ID = ID;
    }

    @Getter @Setter
    private String id_flight;
    @Getter @Setter
    private String id_user;
    @Getter @Setter
    private String id_person;

    @Override
    public String toString() {
        return "Reservation{" +
                "id_flight='" + id_flight + '\'' +
                ", id_user='" + id_user + '\'' +
                ", id_person='" + id_person + '\'' +
                '}';
    }
}