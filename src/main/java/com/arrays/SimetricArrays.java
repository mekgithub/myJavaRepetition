package com.arrays;

public class SimetricArrays {
    public static void main(String[] args) {
        int[] myArr={1,2,3,4,5,5,4,3,2,1};
        System.out.println(isSymteric(myArr));

    }
    public static boolean isSymteric(int[] arr){
        boolean result=true;
        int index=arr.length-1;
        for (int i=0;i<arr.length/2; i++){
            if (arr[i]!=arr[index]){
                result=false;
            }
            index--;
        }
        return result;
    }
}
