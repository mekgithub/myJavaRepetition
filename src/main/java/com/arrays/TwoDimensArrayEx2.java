package com.arrays;

public class TwoDimensArrayEx2 {
    public static void main(String[] args) {
        String[][] cities = {{"newyork", "Atlanta"},
                {"Houston", "Stafford"},
                {"Austin", "Boston"}
        };
        printCitiesFirstLetterA(cities);
      // printAsTriangle(TenByTenArray);
    }


    public static void printCitiesFirstLetterA(String[][] cityNames){

       for(int i=0;i<cityNames.length;i++){
           for(int j=0; j<cityNames[i].length;j++){
               String city=cityNames[i][j];
               if(city.charAt(0)=='A'){
                   System.out.println(cityNames[i][j]);

               }
           }
       }
    }

}
