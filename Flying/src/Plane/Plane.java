package Plane;

import Person.Passenger;

public abstract class Plane {
    int passenger;
    int capacity;
    int fare=100;
    public int takeTicket(int personCount){
        int ticketFare = personCount * fare;
        return ticketFare;

    }

    public int getPassenger() {
        return passenger;
    }

    public void setPassenger(int passenger) {
        this.passenger = passenger;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getFare() {
        return fare;
    }

    public void setFare(int fare) {
        this.fare = fare;
    }

    public abstract int takeTicket(int personCount, Passenger passenger);
}
