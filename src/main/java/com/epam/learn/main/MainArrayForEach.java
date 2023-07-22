package com.epam.learn.main;

import java.util.Arrays;

public class MainArrayForEach {
    public static void main(String[] args) {
//        String [] strings = {"Java", "Oracle", "<epam>"};
//        for (int i = 0; i < strings.length; i++) {
//            strings[i] +=11;
//        }
//        for(String elem : strings){
//            System.out.println(elem);
//        }
        //System.out.println(Arrays.toString(strings));
        /*for(String elem: strings){
            System.out.println(elem);
        }*/
        /*StringBuilder [] srtingBuilders = new StringBuilder[3];
        srtingBuilders[0] = new StringBuilder("Java");
        srtingBuilders[1] = new StringBuilder("Oracle");
        srtingBuilders[2] = new StringBuilder("<epam>");
       // System.out.println(Arrays.toString(srtingBuilders));
        for (StringBuilder elem: srtingBuilders) {
            elem.append(" " + 12);
        }
        for(StringBuilder elem: srtingBuilders){
            System.out.println(elem);
        }*/
        int[] array = {5, 2, 0, 16, -2, -5};
        int max = array[0];
        for( int value : array){
            if( max < value){
                max = value;
            }
        }
       // System.out.println(max);// - вывод мах значения
        for (int i = 0; i < array.length; i++) {
            if(array[i] < 0){
                array[i]=max;
            }
            System.out.println("array[ " + i + " ] = " + array[i]);//замена <0 на МАХ
        }

    }
}
