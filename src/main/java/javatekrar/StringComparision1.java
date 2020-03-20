package javatekrar;

import java.util.Scanner;

public class StringComparision1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter M or F");
        String gender=scanner.next();
        if(gender.equals("m")){
            System.out.println("Male");
        }
        else {
            System.out.println("Female");
        }
    }
}
