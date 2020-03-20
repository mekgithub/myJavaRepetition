package com.w3.schoolstopics;

public class Constr3 {
    int modelYear;
    String modelName;

    public Constr3(int year, String Model){
        modelYear=year;
        modelName=Model;
    }

    public static void main(String[] args) {
        Constr3 myObj=new Constr3(1984,"Porsche");
        System.out.println(myObj.modelName + " " + myObj.modelYear);
    }
}
