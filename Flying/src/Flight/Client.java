package Flight;

import Person.Passenger;
import Plane.EasyJet;
import Plane.Pegasus;
import Plane.THY;
import Services.AgeController;
import Services.BuyTicketService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        List<Passenger> passengers = new ArrayList<>();
        System.out.println("Welcome to flying management system");
        while (true){

            System.out.print("Passenger Name:");
            String name= input.next();
            System.out.print("Passenger Age:");
            int age=input.nextInt();
            System.out.println("isBusinessClass Y/N");
            String choose=input.next();
            boolean isBusinessClass;
            boolean isFoodMenu;
            if(choose.equals("Y")){
                isBusinessClass=true;
            }else {
                isBusinessClass=false;

            }
            System.out.println("isFoodMenü Y/N");
            choose= input.next();
            if(choose.equals("Y")){
                isFoodMenu=true;

            }else {
                isFoodMenu=false;
            }


            System.out.println("Which airline:\n" +
                    "THY-T\n"+
                    "Pegasus-P\n" +
                    "EasyJet-E");
            choose= input.next();
            Passenger passenger=new Passenger(name,age,choose,isBusinessClass,isFoodMenu);
            BuyTicketService buyTicketService=new BuyTicketService();
            AgeController ageController=new AgeController(passenger);
            buyTicketService.BuyTicket(passenger);
            Flight flight=new Flight(passenger,choose);
            if(flight.getAirLine().equals("P")){
                passenger.setAirLine("Pegasus");
                Pegasus pegasus=new Pegasus();

                int price=pegasus.takeTicket(1,passenger);
                if(ageController.isChild(passenger)==true){
                    int discount=100;
                    price-=discount;
                    System.out.println("price:" + price);


                }if(ageController.isChild(passenger)==false) {
                    System.out.println("price:"+price);
                }

            }
            if(flight.getAirLine().equals("T")){
                THY thy =new THY();
                passenger.setAirLine("Turkish Airlines");

                int price=thy.takeTicket(1,passenger);
                if(ageController.isChild(passenger)){
                    int discount=70;
                    price-=discount;
                    System.out.println("price:"+price);

                }else {
                    System.out.println("price:"+price);
                }

            }
            if(flight.getAirLine().equals("E")){
                EasyJet easyJet =new EasyJet();
                passenger.setAirLine("EasyJet");

                int price=easyJet.takeTicket(1,passenger);
                if(ageController.isChild(passenger)==true){
                    int discount=50;
                    price-=price;
                    System.out.println("price"+price);

                }if(ageController.isChild(passenger)==false) {
                    System.out.println("price"+price);
                }

            }

            buyTicketService.BuyTicket(passenger);
            passengers.add(passenger);
            System.out.println(passengers);


        }







    }
}
