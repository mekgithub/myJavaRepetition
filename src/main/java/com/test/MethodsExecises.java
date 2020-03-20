package com.test;
//1)print a void method your  name/2)write a string method name with/without parameter
public class MethodsExecises {
    public static String printName(String name){

        System.out.println();
        return  name;
    }
    public static String printName1(){
        String name="HelloHalil";
        return name;
    }
    public static void printNameVoid(){
        String name="VoidName";
        System.out.println(name);
    }
    public static void printNameVoidPara(String name){
        System.out.println(name);
    }

    public static void main(String[] args) {
        System.out.println(printName("Halil"));
        System.out.println(printName1());
        printNameVoid();
        printNameVoidPara("hahaHooo");
    }
}
