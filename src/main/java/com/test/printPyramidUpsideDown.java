package com.test;
//2
public class printPyramidUpsideDown {
    public static void pyramidPrint() {
        int limit=19;
        for (int i=1;i<=10;i++) {
            for (int j=1;j<=i;j++) {
                System.out.print(" ");

            }
            for (int k=limit;k>0;k--) {
                System.out.print("*");
            }
            limit=limit-2;
            System.out.println();
        }
    }
}
