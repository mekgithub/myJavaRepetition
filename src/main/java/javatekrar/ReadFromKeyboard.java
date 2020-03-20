package javatekrar;
import java.util.Scanner;

public class ReadFromKeyboard {
    public static void main(String [] args){
        Scanner readKeyboard=new Scanner(System.in);

        System.out.print("Please Enter Your Name :");
        String name=readKeyboard.next();

        System.out.println("Enter Your Age : ");
        int age=readKeyboard.nextInt();

        System.out.println("What is your weight :");
        float weight=readKeyboard.nextFloat();

        System.out.println("what is your hair color :");
        String hair=readKeyboard.next();
    }
}
