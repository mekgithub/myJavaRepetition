package com.test;

public class ReturningClass {
    public static double calculateVolumeCube(int side){
        double volume=Math.pow(side,3);
        System.out.println(volume);
        return volume;
    }
    public static double incToMeter(int length){
        double meter=length*2.54;
        System.out.println(meter);
        return meter;
    }
    public static double perimetrCircle(int radius){
        double perimeter=1;
        perimeter=2*3.14*radius;
        System.out.println(perimeter);
        return perimeter;

    }

    public static void main(String[] args) {
      perimetrCircle(20);
        //System.out.println(perimetrCircle(10));
    }

}
