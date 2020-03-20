package com.w3.schoolstopics;

public class Final {// Final attribute
    final int x=111;
    final double PI=3.14;

    public static void main(String[] args) {
        Final myObj=new Final();
       // myObj.x=50 // will generate an error; cannot assign a value to a final variable
    }
}
