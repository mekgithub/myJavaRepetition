package com.arrays;
//finding common elemnts of two array,day 27 java,video 00:27:00
public class FindElementArray {
    public static void findcommon(int [] arr1,int[] arr2){
        for(int i=0; i<=arr1.length; i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    System.out.println(arr1[i]);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5,6,7,8,9};
        int[] arr2={1,5,9,11,32};
        FindElementArray.findcommon(arr1,arr2);
    }
}
