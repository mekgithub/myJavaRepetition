package com.w3.schoolstopics;

public class StaticPublicMethods {
    //static method means that it can be accessed without creating an object of the class
    //public means that it can be accessed only by objects.
    static void myStaticMeth(){
        System.out.println("Static methods can be called without creating objects");
    }
    public void myPublicMethod(){
        System.out.println("Public method must be called by creating object");
    }

   public static void main(String [] args){
        myStaticMeth();// calling the static method
        StaticPublicMethods publicObj=new StaticPublicMethods();//creating object for public method
     publicObj.myPublicMethod();//calling the public method
   }
}
