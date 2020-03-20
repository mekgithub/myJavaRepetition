package com.w3.schoolstopics;

public class CreatingObject {
    int yearCar;
    String modelCar;

    public CreatingObject(int year, String model){//contsractor with param
        this.yearCar=year;
        modelCar=model;

    }

    public static void main(String[] args) {
        CreatingObject myObj=new CreatingObject(2000," Ford");
        System.out.println(myObj.modelCar+" "+myObj.yearCar);
    }
}
