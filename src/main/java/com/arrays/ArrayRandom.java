package com.arrays;

public class ArrayRandom {
    public static void main(String[] args) {
        int[] arr = new int[20];
        double randomnumber;
        for (int i = 0; i < arr.length; i++){
            randomnumber=Math.random()*(5000-1000)+1000;
            arr[i] =  (int) randomnumber;
            System.out.println(arr[i]);
        }

    }
    public static void listAllElementsofArray(int arr[]){
        for(int i=0; i<arr.length ; i++){
            System.out.println(arr[i]);
        }
    }
}
