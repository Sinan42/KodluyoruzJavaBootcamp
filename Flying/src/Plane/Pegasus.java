package Plane;

import Person.Passenger;

public class Pegasus extends Plane implements IFoodChoose,ILuggageRight{
    private final int businessAddFare = 500;
    private Passenger passenger;




    @Override
    public int takeTicket(int personCount, Passenger passenger) {
        int takeTicket=super.takeTicket(personCount);
        if(passenger.isBusinessClass()){
            takeTicket = takeTicket + businessAddFare*personCount;
        }
        return takeTicket;
    }

    @Override
    public void foodChoice(Passenger passenger) {
        if(passenger.isFoodMenu()){
            System.out.println("You have the right to eat");
        }else {
            System.out.println("You dont have the right to eat ");
        }
    }

    @Override
    public void luggageRight() {
        System.out.println("Luggage right");

    }
}
