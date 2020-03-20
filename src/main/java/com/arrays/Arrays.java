package com.arrays;

public class Arrays {
    public static void main(String[] args) {
        String[] colors = {"Blue","Yellow", "Orange", "Red", "Green"};
        System.out.println(colors[1]);
        int[] a={1,2,3,4,5,6,7,8};
        a[4]=999;
        for(int i=0;i<a.length; i++){
            System.out.printf("%3d",a[i]);
        }
    }
}
