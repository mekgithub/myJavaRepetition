package com.arrays;

public class woDimensionalArrays {
    public static void main(String[] args) {
        int[][] myNumbers = {{1, 2, 3, 4}, {5, 6, 7}};
        for (int i = 0; i <myNumbers.length; i++){
            for(int j=0; j<myNumbers[i].length;j++){
                System.out.printf("%3d",myNumbers[i][j]);
            }
        }
    }
}
