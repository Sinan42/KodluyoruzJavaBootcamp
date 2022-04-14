package Plane;

import Person.Passenger;

public class EasyJet extends Plane {
    private final int businessAddFare=200;
    @Override
    public int takeTicket(int personCount, Passenger passenger) {
        int takeTicket=super.takeTicket(personCount);
        if(passenger.isBusinessClass()){
            takeTicket = takeTicket + businessAddFare*personCount;
        }
        return takeTicket;
    }
}
