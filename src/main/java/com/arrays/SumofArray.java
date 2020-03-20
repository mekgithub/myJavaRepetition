package com.arrays;

public class SumofArray {
    public static void main(String[] args) {
        int [] array={1,2,3,4,5,6,7,8};
        int sum=0;
        for(int i=array.length-1;i>=0; i--){
            sum=sum+array[i];

        }
        System.out.println(sum);
      // sum++;

    }
}
