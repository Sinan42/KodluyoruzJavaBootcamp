import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Apple apple=new Apple("apple",100,5);
        Pear pear=new Pear("pear",100,6);
        Cherry cherry=new Cherry("cherry",100,7);
        int choose,chooseProduct,amountApple=0,amountPear=0,amountCherry=0,sum=0;
        System.out.println("There are"+"\n"+ apple.getAmount()+" kg " + apple.getName()+"\n"+
                pear.getAmount()+" kg " + pear.getName()+"\n"+
                cherry.getAmount()+" kg " + cherry.getName()+"\n"+"in warehouse");
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to Greengrocery");
        while (true){

            System.out.println("1.For sale\n" +
                    "2.exit");
            choose= input.nextInt();
            if(choose==1){
                System.out.println("1. Apple\n" +
                        "2. Pear\n"+
                        "3. Cheery");
                chooseProduct=input.nextInt();
                if(chooseProduct==1){

                    if(apple.getAmount()>0){
                        System.out.println("How many kilos of apples do you want?");
                        amountApple= input.nextInt();
                        apple.setAmount(apple.getAmount()-amountApple);
                        if(apple.getAmount()>0){
                        System.out.println("Remaning="+apple.getAmount());
                        sum+=apple.getPrice()*amountApple;
                        }else {
                            System.out.println("the product has run out.");
                        }

                    }
                }
                if(chooseProduct==2){

                    if(pear.getAmount()>0){
                        System.out.println("How many kilos of pears do you want?");
                        amountPear= input.nextInt();
                        pear.setAmount(pear.getAmount()-amountPear);
                        if(pear.getAmount()>0){
                            System.out.println("Remaning="+pear.getAmount());
                            sum+=pear.getPrice()*amountPear;
                        }else {
                            System.out.println("the product has run out.");

                        }


                    }
                }
                if(chooseProduct==3){
                    if(cherry.getAmount()>0){
                        System.out.println("How many kilos of cherries do you want?");
                        amountCherry= input.nextInt();
                        cherry.setAmount(cherry.getAmount()-amountCherry);
                        if(pear.getAmount()>0){
                            System.out.println("Remaning="+cherry.getAmount());
                            sum+=cherry.getPrice()*amountCherry;
                        }else {
                            System.out.println("the product has run out.");

                        }


                    }
                }

            }
            if (choose==2){
                System.out.println("Bye");
                System.out.println("Price:"+sum+" lira");
                break;
            }
        }


    }
}
