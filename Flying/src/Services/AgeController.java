package Services;


import Person.Passenger;

public class AgeController {

    private Passenger passenger;
    public boolean isChild(Passenger passenger){
        if(passenger.getAge()>0&&passenger.getAge()<12){
            return true;
        }
        return false;
    }


    public AgeController(Passenger passenger) {
        this.passenger = passenger;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }
}
