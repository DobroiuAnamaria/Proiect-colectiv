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
public class Person {
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
    private String lastName;

    @Getter @Setter
    private String firstName;

    @Getter @Setter
    private String luggageType;

    public Person(String lastName, String firstName, String luggageType) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.luggageType = luggageType;
    }

    @Override
    public String toString() {
        return "Person{" +
                "last Name='" + lastName + '\'' +
                ", first Name='" + firstName + '\'' +
                ", luggage Type='" + luggageType + '\'' +
                '}';
    }
}
