package Flight;

import Person.Passenger;

public class Flight {
    private Passenger passenger;
    private String airLine;

    public Flight(Passenger passenger, String airLine) {
        this.passenger = passenger;
        this.airLine = airLine;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public String getAirLine() {
        return airLine;
    }

    public void setAirLine(String airLine) {
        this.airLine = airLine;
    }
}
