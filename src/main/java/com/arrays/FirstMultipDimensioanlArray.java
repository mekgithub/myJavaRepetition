package com.arrays;

public class FirstMultipDimensioanlArray {
    public static void main(String[] args) {
       String [][] names={{"james","Alice"},{"Wilson","Jenifer"},{"Michael","David","Angela"}};
       for(int i=0; i<names.length;i++ ){
           for(int j=0; j<names[i].length;j++){
               System.out.println(names[i][j]);

           }
       }
       char [][] letters={{'a','b','c'},{'d','e','f'}};
       for(int i=0; i<letters.length;i++){
           for(int j=0;j<letters[i].length; j++){
               System.out.println(letters[i][j]);
           }
       }
    }

}
