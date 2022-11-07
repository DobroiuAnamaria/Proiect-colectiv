package Models;

import java.util.Objects;

public class Flight extends Entity<Integer>{

    private String destiantion; //oras
    private String departure; //oras
    private String dateDeparture;
    private String timeDeparture;
    private String airport;
    private int numberOfplace;

    public Flight(String destiantion, String arrival, String dateDeparture, String timeDeparture, String airport, int numberOfplace) {
        this.destiantion = destiantion;
        this.departure = arrival;
        this.dateDeparture = dateDeparture;
        this.timeDeparture = timeDeparture;
        this.airport = airport;
        this.numberOfplace = numberOfplace;
    }

    public String getDestiantion() {
        return destiantion;
    }

    public void setDestiantion(String destiantion) {
        this.destiantion = destiantion;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getDateDeparture() {
        return dateDeparture;
    }

    public void setDateDeparture(String dateDeparture) {
        this.dateDeparture = dateDeparture;
    }

    public String getTimeDeparture() {
        return timeDeparture;
    }

    public void setTimeDeparture(String timeDeparture) {
        this.timeDeparture = timeDeparture;
    }

    public String getAirport() {
        return airport;
    }

    public void setAirport(String airport) {
        this.airport = airport;
    }

    public int getNumberOfplace() {
        return numberOfplace;
    }

    public void setNumberOfplace(int numberOfplace) {
        this.numberOfplace = numberOfplace;
    }



    @Override
    public String toString() {
        return "the flight's dates:" +
                "Departure: " + destiantion + " " +
                "| Arrival: " + departure + '\n' +
                "| Date of departure: " + dateDeparture + " " +
                "| Time of departure: " + timeDeparture + " " +
                "| Airport: " + airport + '\n' +
                "| Number of place :" + numberOfplace +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return numberOfplace == flight.numberOfplace && Objects.equals(destiantion, flight.destiantion) && Objects.equals(departure, flight.departure) && Objects.equals(dateDeparture, flight.dateDeparture) && Objects.equals(timeDeparture, flight.timeDeparture) && Objects.equals(airport, flight.airport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(destiantion, departure, dateDeparture, timeDeparture, airport, numberOfplace);
    }

}