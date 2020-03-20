package javatekrar;

import java.util.Scanner;

public class ElseIfStatement {
    public static void main(String[] args) {
        Scanner ageGroup=new Scanner(System.in);

        System.out.println("Age ?");
        int age=ageGroup.nextInt();

        if(age<15){
            System.out.println("Child");
        }
        else if (age>15 && age<30){
            System.out.println("Young");
        }
        else {
            System.out.println("aAdult");
        }

    }
}
