package javatekrar;
//20 next multiplicationtable

import java.util.Scanner;

public class ForLoop2 {
    public static void main(String[] args) {
       // for all uppercase letters
    /*   for(int i=65;i<=91; i++) {
           System.out.print((char)i);
       }//for uppercase letters
       for(int j=97;j<=122; j++){
           System.out.print((char)j);
       }
       for(int k=0;k<100;k++){
           if(k%2!=0){
               System.out.println("This is ODD numbers= "+k);
           }
           else{
               System.out.println("This is Even Number= "+k);
           }
       }*/
        Scanner number=new Scanner(System.in);
        System.out.println("Start ?");
        int start=number.nextInt();
        System.out.println("What is the End");
        int end=number.nextInt();
        for(int i=start; i<end; i++){
            if(start<end){
                System.out.println(i);
            }
            else {
                System.out.println("please give invalid nuber");
            }
        }
    }
}
