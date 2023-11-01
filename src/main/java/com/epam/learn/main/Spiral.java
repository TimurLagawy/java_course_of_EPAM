package com.epam.learn.main;

public class Spiral {
    public static int[][] spiral(int rows, int columns) {
        int[][] result = new int[rows][columns];
        int value = 1;
        int topRow = 0;
        int bottomRow = rows - 1;
        int leftCol = 0;
        int rightCol = columns - 1;

        for (int j = 0; j < rows*columns - 1; j++) {
            if (value <= rows * columns){
            for (int i = leftCol; i <= rightCol; i++) {
                result[topRow][i] = value++;
            }
            topRow++;
            }
            if (value <= rows * columns) {
                for (int i = topRow; i <= bottomRow; i++) {
                    result[i][rightCol] = value++;
                }
                rightCol--;
            }
            if (value <= rows * columns) {
                for (int i = rightCol; i >= leftCol; i--) {
                    result[bottomRow][i] = value++;
                }
                bottomRow--;
            }
            if (value <= rows * columns) {
                for (int i = bottomRow; i >= topRow; i--) {
                    result[i][leftCol] = value++;
                }
                leftCol++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        {
            int[][] spiral = Spiral.spiral(1, 2);

            for (int i = 0; i < spiral.length; i++) {
                for (int j = 0; j < spiral[i].length; j++) {
                    System.out.print(String.format("%4s", spiral[i][j]));
                }
                System.out.println();
            }
        }
        {
            int[][] spiral = Spiral.spiral(3, 4);

            for (int i = 0; i < spiral.length; i++) {
                for (int j = 0; j < spiral[i].length; j++) {
                    System.out.print(String.format("%4s", spiral[i][j]));
                }
                System.out.println();
            }
        }
        {
            int[][] spiral = Spiral.spiral(5, 6);

            for (int i = 0; i < spiral.length; i++) {
                for (int j = 0; j < spiral[i].length; j++) {
                    System.out.print(String.format("%4s", spiral[i][j]));
                }
                System.out.println();
            }
        }
        {
            int[][] spiral = Spiral.spiral(5, 5);

            for (int i = 0; i < spiral.length; i++) {
                for (int j = 0; j < spiral[i].length; j++) {
                    System.out.print(String.format("%4s", spiral[i][j]));
                }
                System.out.println();
            }
        }
    }
}