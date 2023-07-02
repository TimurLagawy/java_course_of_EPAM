package com.epam.learn.main;

public class TestFor {
    public static void main(String[] args) {
       /* for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }*/
        /*int sum = 0;
        for( int val = 0; val <= 10; val++){
           sum += val;

        }System.out.println("Sum of numbers 1...10= " + sum);*/
        /*int a, b;
        for (a = 1, b = 4; a < b; a++, b--){
            System.out.println("\n Iteration Initialisation");
            System.out.println("a = " + a);
            System.out.println("b = " + b);
            System.out.println("Iteration completion");*/
        for( int i = 0, j = 0; i < 10 && j > -10; i++, j--){
            if(i == 5){
                continue;
            }
            System.out.println(i + " " + j + " ");
        }
    }
}
