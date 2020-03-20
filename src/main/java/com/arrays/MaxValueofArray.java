package com.arrays;

public class MaxValueofArray {
    public static void main(String[] args) {
        int [] myArr={12,543,6,123,654,6,765};
        System.out.println(maxOfArray(myArr));

    }
    public static int maxOfArray(int[] arr){
        int container=arr[0];
        for(int i=1; i<arr.length ; i++){
            if(arr[i]>container){
                container=arr[i];
            }
        }
        return container;
    }
}
