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

    public UUID getID() {
        return ID;
    }

    public void setID(UUID ID) {
        this.ID = ID;
    }

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
    private int price;

    public Flight(String departure, String arrival, String depDate, String arrDate, String depTime, String arrTime, String depAirport, String arrAirport, String duration, String airline, int totalSits, int availableSits, int price) {
        this.departure = departure;
        this.arrival = arrival;
        this.depDate = depDate;
        this.arrDate = arrDate;
        this.depTime = depTime;
        this.arrTime = arrTime;
        this.depAirport = depAirport;
        this.arrAirport = arrAirport;
        this.duration = duration;
        this.airline = airline;
        this.totalSits = totalSits;
        this.availableSits = availableSits;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "departure='" + departure + '\'' +
                ", arrival='" + arrival + '\'' +
                ", depDate='" + depDate + '\'' +
                ", arrDate='" + arrDate + '\'' +
                ", depTime='" + depTime + '\'' +
                ", arrTime='" + arrTime + '\'' +
                ", depAirport='" + depAirport + '\'' +
                ", arrAirport='" + arrAirport + '\'' +
                ", duration='" + duration + '\'' +
                ", airline='" + airline + '\'' +
                ", totalSits=" + totalSits +
                ", availableSits=" + availableSits +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flight flight)) return false;
        return getTotalSits() == flight.getTotalSits() && getAvailableSits() == flight.getAvailableSits() && getPrice() == flight.getPrice() && Objects.equals(getDeparture(), flight.getDeparture()) && Objects.equals(getArrival(), flight.getArrival()) && Objects.equals(getDepDate(), flight.getDepDate()) && Objects.equals(getArrDate(), flight.getArrDate()) && Objects.equals(getDepTime(), flight.getDepTime()) && Objects.equals(getArrTime(), flight.getArrTime()) && Objects.equals(getDepAirport(), flight.getDepAirport()) && Objects.equals(getArrAirport(), flight.getArrAirport()) && Objects.equals(getDuration(), flight.getDuration()) && Objects.equals(getAirline(), flight.getAirline());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDeparture(), getArrival(), getDepDate(), getArrDate(), getDepTime(), getArrTime(), getDepAirport(), getArrAirport(), getDuration(), getAirline(), getTotalSits(), getAvailableSits(), getPrice());
    }
}