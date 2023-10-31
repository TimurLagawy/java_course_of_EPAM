package com.epam.learn.main;

public class Spiral {
    public static int[][] spiral(int rows, int columns) {
        int[][] result = new int[rows][columns];
        int value = 1;
        int topRow = 0, bottomRow = rows - 1, leftCol = 0, rightCol = columns - 1;

        while (value <= rows * columns) {
            // Traverse top row
            for (int i = leftCol; i <= rightCol; i++) {
                result[topRow][i] = value++;
            }
            topRow++;

            // Traverse right column
            for (int i = topRow; i <= bottomRow; i++) {
                result[i][rightCol] = value++;
            }
            rightCol--;

            // Traverse bottom row
            for (int i = rightCol; i >= leftCol; i--) {
                result[bottomRow][i] = value++;
            }
            bottomRow--;

            // Traverse left column
            for (int i = bottomRow; i >= topRow; i--) {
                result[i][leftCol] = value++;
            }
            leftCol++;
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] spiral = Spiral.spiral(5, 6);

        for (int i = 0; i < spiral.length; i++) {
            for (int j = 0; j < spiral[i].length; j++) {
                System.out.print(String.format("%4s", spiral[i][j]));
            }
            System.out.println();
        }
    }
}