package javatekrar;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;
//exapmle 17; before nestedif,next CarPurchase / 01/07/2019 01:40:00
public class NestedIfBillCalculate {
    public static void main(String[] args) {
        Scanner internet = new Scanner(System.in);
        System.out.println("Are you subcsribe ");
        String subscription = internet.next();

        if(subscription.equalsIgnoreCase("Y")){
            System.out.println("What is your internet usage");
            int usage=internet.nextInt();
            if(usage<100 && usage>0) System.out.println("10 usd");
            else if(usage>100) System.out.println("40 usd");
            else System.out.println("invalid usage,please check you bill !");

        }
        else {
            System.out.println("Please first subscribe");
        }
    }
}
