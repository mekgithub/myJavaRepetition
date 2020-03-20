package javatekrar;

import sun.security.krb5.SCDynamicStoreConfig;

import java.util.Scanner;

public class YazBoz {
    public static void main(String[] args) {
        Scanner guessing=new Scanner(System.in);
        System.out.println("Put your guessing number");
        int number=guessing.nextInt();
        int guess=0;
        if (number<10){
            System.out.println("Larger");

        }else if(number>10){
            System.out.println("smaller");

        }
        else if (guess==number){
            System.out.println("Congrats");
        }
        else {
            System.out.println("invalid");
        }
        guess++;
    }
}
