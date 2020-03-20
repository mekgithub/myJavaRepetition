package javatekrar;

import java.util.Scanner;

public class PrintFormatExample {
    public static void main(String[] args) {
        double amountGold=2.45;
        double perOnceGold=245.87988;
        double total=amountGold*perOnceGold;
        String opinion="Java is Cool";

        System.out.printf("Total amount is %.2f",total);
        System.out.printf("Do you think %s ", opinion);

    }
}
