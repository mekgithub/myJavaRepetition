package com.arrays;

public class StringArray {
    public static void main(String[] args) {
        String[] cities={"New York","Los Angeles","Ann Arbor","Chicago","Mineapolis","Sait Lake City","New Jersey"};
        for(int i=cities.length-1;i>=0; i--) {
            System.out.println(cities[i]);
        }
    }
}
