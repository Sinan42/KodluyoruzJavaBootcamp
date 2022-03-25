import java.util.*;

public class Main {
    public static void main(String[] args) {
        //1. Soru
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " 2'ye tam bölünmektedir.");
            }

        }
        //2. Soru
        List<String> Names = new ArrayList<String>();
        Names.add("Murat");
        Names.add("Ahmet");
        Names.add("Mehmet");
        int count = 0;
        for (String name : Names) {
            count++;
            System.out.println(count + "." + name);

        }
        //3. Soru
        HashMap<Integer, String> Students = new HashMap<Integer, String>();
        Students.put(101, "M");
        Students.put(123, "F");
        Students.put(312, "F");
        Students.put(431, "M");
        Students.put(521, "F");
        Students.put(612, "M");
        Students.put(712, "F");
        Students.put(821, "M");
        Students.put(912, "F");
        Students.put(132, "M");
        Set set = Students.entrySet();
        Iterator i = set.iterator();
        while (i.hasNext()) {
            Map.Entry std = (Map.Entry) i.next();
            System.out.println(std.getKey() + " : " + std.getValue());


        }
        //4. Soru
        Scanner input=new Scanner(System.in);
        int age,choose;
        double price=50;
        System.out.print("Age:");
        age= input.nextInt();


        System.out.println("Which film do you want to watch?\n" +
                "1.     Horror film\n" +
                "2.     Normal film");
        choose=input.nextInt();
        if(age>0){
            if(age<18){
                price = price - (price * 0.1);
                if(choose==1){
                    price=price-(price*0.1);
                    System.out.println();
                    System.out.println("Ticket 10% and %10 off price: "+price);
                }else {
                    System.out.println("Ticket 10% .. price: "+price);
                }

            }else if(age>=18&&age<25){
                price=price-(price*0.05);
                if(choose==1){
                    price=price-(price*0.1);
                    System.out.println();
                    System.out.println("Ticket 5% and %10 off price: "+price);
                }else {
                    System.out.println("Ticket 5% .. price: "+price);
                }

            }else {

                if(choose==1){
                    price=price-(price*0.1);
                    System.out.println();
                    System.out.println("Normal price %10 off: "+price);
                }else {
                    System.out.println("Normal price: "+price);
                }
            }

        }else {
            System.out.println("Please enter the right age");
        }




    }




}
