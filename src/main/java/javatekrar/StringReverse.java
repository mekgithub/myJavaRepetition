package javatekrar;

import java.lang.String;
import java.io.*;
import java.util.*;

public class StringReverse {
    public static void main(String[] args) {

       String str="Hello";
       String reversed="";
       for(int i=str.length()-1 ; i>=0 ; i--){
           reversed+=str.charAt(i);
       }
        System.out.println(reversed);
    }

}
