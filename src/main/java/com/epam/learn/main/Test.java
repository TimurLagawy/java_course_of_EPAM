package com.epam.learn.main;

import java.util.Arrays;

public class Test {
   public static void main(String[] args) {
//        String[] strArray = new String[] {"One", "Two", "Three"};
//        strArray[2] = null;
//        for (String val : strArray)
//            System.out.print(val + ", ");
//        int[][] array3 = {{1, 2, 3} ,{0} ,{1, 2, 3, 4, 5}};
//        System.out.println(Arrays.toString(array3));
//        int[] array = new int[] {3, 4, 2, 1};
//        Arrays.sort(array);
//        System.out.println(Arrays.toString(array));
//        int[] array = {1, 2, 3, 4};
//        System.out.println(Arrays.toString(array));

//        int size = 4;
//        int[] testArr = new int [size];
//        Arrays.fill(testArr, 1);
//        System.out.println(Arrays.toString(testArr));//заполнение массива 1
        int elem = 1;
        int k = 3; int h = 6;

        int[][] snake = new int[k][h];

        int topRow = 0;
        int rightColumn = h - 1;
        int bottomRow = k - 1;
        int lefColumn = 0;
       while (elem <= h * k) {
           for (int i = lefColumn; i <= rightColumn; i++) {
               snake[topRow][i] = elem;
               elem++;
           }
           topRow++;
           System.out.println(elem);
           for (int i = topRow; i <= bottomRow; i++) {
               snake[i][rightColumn] = elem;
               elem++;
           }
           rightColumn--;
           System.out.println(elem);
           for (int i = rightColumn; i >= lefColumn; i--) {
               snake[bottomRow][i] = elem;
               elem++;
           }
           bottomRow--;
           System.out.println(elem);
           for (int i = bottomRow; i >= topRow; i--) {
               snake[i][lefColumn] = elem;
               elem++;
           }
           lefColumn++;
       }

        Arrays.stream(snake).map(Arrays::toString).forEach(System.out::println);
    }
}

