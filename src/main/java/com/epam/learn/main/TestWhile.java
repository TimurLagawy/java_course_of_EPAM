package com.epam.learn.main;

public class TestWhile {
    public static void main(String[] args) {
       /* int i=0;
    while (i<5) {
        System.out.println("Iteration " + i);
        i++;
    }}*/
        /*int i = 0;
       outer: while ( i < 5){
           int j = 0;
           while ( j < 2){
               j++;
               System.out.println("i = " + i +" j = " + j);
              break outer ;
           }*/
        int i = 0;
        outer: while (i++ < 3){
            int j = 0;
            while (j++ < 5){
                if (j == 2){
                    continue outer;
                }
                System.out.println("i = " + i + " j = " + j);
            }
        }
}}
