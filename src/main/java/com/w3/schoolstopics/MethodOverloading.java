package com.w3.schoolstopics;

//Why overloading? : instead of defining two methods(or multiple) that should do the same thing,it is better to overload one.
//with the example below,we overload the one method to work for both int and double.


public class MethodOverloading {
    static int plusMethod(int x,int y){

        return x+y;
    }
    static double plusMethod(double x,double y){
        return x+y;
    }

    public static void main(String[] args) {
       int no1= plusMethod(5,3);
        double no2=plusMethod(10,111.2);
        System.out.println("Int "+ no1);
        System.out.println("double "+no2);
    }
}
