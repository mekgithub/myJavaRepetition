package com.w3.schoolstopics;
//Finallay statement lets you execute code after try...catch .
public class ExceptionFinally {
    public static void main(String[] args) {
        try {
            int[] myNumbers={1,2,3,4,5};
            System.out.println(myNumbers[10]);
        }catch (Exception e){
            System.out.println("Something went wrong");
        }finally{
            System.out.println("The try catch is finished");
        }
    }
}
