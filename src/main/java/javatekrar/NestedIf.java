package javatekrar;

import java.util.Scanner;

//example 16 next nestedifBillCalculate
public class NestedIf {
    public static void main(String[] args) {
        Scanner score=new Scanner(System.in);
        System.out.println("please write your grade");
        int grade=score.nextInt();

        if(grade>0 && grade<50) System.out.println("Fail");
        else if(grade>50 && grade<59) System.out.println("A");
        else if(grade>60 && grade<69) System.out.println("B");
        else if(grade>70 && grade<80) System.out.println("C");
        else if(grade>80 && grade<90) System.out.println("D");
        else if(grade>90 && grade<1000) System.out.println("E");
        else System.out.println("Invalid Grade");
    }
}
