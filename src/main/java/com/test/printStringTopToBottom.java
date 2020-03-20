package com.test;

public class printStringTopToBottom {
    public static void printString(String word){
        for(int i=0;i<word.length(); i++){
          System.out.println(word.charAt(i));
        }
    }
    public static void main(String[] args) {
       printString("Hello");
    }
}
