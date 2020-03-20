package javatekrar;

import java.util.Scanner;
//18 after billcalculate 03/07/2019 ext for loop 1
public class CarPurchaseNestedIF
{
    public static void main(String[] args) {
        Scanner chooses=new Scanner(System.in);
        System.out.println("What is your car type X or Y");
        String carType=chooses.next();
        if(carType.equalsIgnoreCase("X")){
            System.out.println("What is your body package Body or sound");
            String pack=chooses.next();
            if(pack.equalsIgnoreCase("body")) System.out.println(" 35000$");
            else if(pack.equalsIgnoreCase("sound")) System.out.println("33000");
            else if(pack.equalsIgnoreCase("body+sound")) System.out.println(38000);
            else System.out.println("please give a correct choose");
        }
        else if(carType.equalsIgnoreCase("Y")){
            System.out.println("do you want to Entertaintmnet or Safety");
            String pack=chooses.next();
            if(pack.equalsIgnoreCase("Entertainment")) System.out.println("43000$");
            else if(pack.equalsIgnoreCase("safety")) System.out.println("39000$");
            else if(pack.equalsIgnoreCase("both")) System.out.println("47000$");
            else System.out.println("give corrrect pack please");

        }
        else System.out.println("invalid chooses");
    }
}
