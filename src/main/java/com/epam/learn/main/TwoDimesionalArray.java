package com.epam.learn.main;

import java.util.Arrays;

public class TwoDimesionalArray {
    public static void main(String[] args) {
        int[][] multiplicationTable = new int[5][];
        System.out.println("multiplicationTable = " + Arrays.toString(multiplicationTable));
        for (int i = 0; i < multiplicationTable.length; i++) {
            System.out.println("multiplicationTable [ " + i + " ] = " + multiplicationTable[i]);
        }
        System.out.println("\n Create array ");
        for (int i = 0; i < multiplicationTable.length; i++) {
            multiplicationTable[i] = new int[5];
            System.out.println("multiplicationTable [ " + i + " ] = " + Arrays.toString(multiplicationTable[i]));

        }
        System.out.println("\n Initialization array " );
        for (int i = 0; i < multiplicationTable.length; i++) {
            for (int j = 0; j < multiplicationTable[i].length; j++) {
                System.out.print(" " + multiplicationTable[i][j]);
            }System.out.println();
        }

    }
}
