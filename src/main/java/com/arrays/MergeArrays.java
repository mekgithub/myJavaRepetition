package com.arrays;
///bu code tam dogru sonuc vermiyor;;
public class MergeArrays {
    public static void main(String[] args) {
        int[] arr1={1,2,3};
        int[] arr2={4,5,6};
        int size=arr1.length + arr2.length;
        int[] mergedArray=new int[size];
        int index=0;
        for(int i=0;i<arr1.length; i++){
            mergedArray[index]=arr1[i];
            index++;
        }
        for (int j=0;j<arr2.length;j++){
            mergedArray[index]=arr2[j];
            index++;

        }
        System.out.println(mergedArray);
    }
}
