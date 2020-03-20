package com.classexample;

public class Suggestions {
    public static void foodSuggest() {
        double rand = Math.random() * 4;
        int food = (int) rand;
        if (food == 1) {
            System.out.println("Soup");

        } else if (food==2) {
            System.out.println("Salad");

        } else if (food==3) {
            System.out.println("Meat");

        } else {
            System.out.println("wrong chooses");

        }
    }

    public static void main(String[] args) {
        foodSuggest();
    }
}
