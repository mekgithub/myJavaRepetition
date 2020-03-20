package com.arrays;

public class ForeachArray {
    public static void main(String[] args) {
        int[] forForeach={1,2,3,123,123,543,8765,6543,7654,7654,65,76};
       for(int number:forForeach){
           System.out.println(number);
        }
        String[] cities={"Sacramento","nyork","njersey","Atlanta","Boston"};
            for(String city:cities){
                System.out.println(city);
            }
    }
}
