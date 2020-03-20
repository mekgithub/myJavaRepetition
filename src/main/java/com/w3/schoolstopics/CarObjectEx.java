package com.w3.schoolstopics;

public class CarObjectEx {
    private String color;
    private int gates;
    private String wheels;
    private String motor;
    private String brand;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getGates() {
        return gates;
    }

    public void setGates(int gates) {
     if(gates<0){
         System.out.println(" kapi sifirdan kucuk olamaz");
     }
     else {
         this.gates=gates;
     }
    }

    public String getWheels() {
        return wheels;
    }

    public void setWheels(String wheels) {
        this.wheels = wheels;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public static void main(String[] args) {
        CarObjectEx myObj=new CarObjectEx();
       /* myObj.color="red";
        System.out.println(myObj.color);
        myObj.brand="Volvo";
        System.out.println(myObj.brand);
        myObj.gates=4;
        System.out.println(myObj.gates);*/
       myObj.setGates(-4);

    }
}
