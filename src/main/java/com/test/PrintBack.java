package com.test;

public class PrintBack {
    public static String printBacWard(String inputString){
        String reversed="";
        for(int i=inputString.length()-1;i>=0; i--){
           reversed=reversed+inputString.charAt(i);
        }
        return reversed;
    }

}
