package javatekrar;

import java.util.Scanner;

public class IfTriangle {
    public static void main(String[] args) {
        Scanner shapes=new Scanner(System.in);

        System.out.println("a=?");
        int a=shapes.nextInt();
        System.out.println("b=?");
        int b=shapes.nextInt();
        System.out.println("c=?");
        int c=shapes.nextInt();
        if(a+b>c && a+c>b && b+c>a){
            System.out.println("This is Triangle");
        }
        else {
            System.out.println("Not Triangle");
        }
    }
}
