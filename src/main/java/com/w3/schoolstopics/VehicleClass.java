package com.w3.schoolstopics;

public class VehicleClass extends Vehicle {
    private String modelName="Mercedes";

    public static void main(String[] args) {
        VehicleClass myCar=new VehicleClass();
        myCar.honk();
        System.out.println(myCar.modelName+" "+myCar.brand);
    }
}
