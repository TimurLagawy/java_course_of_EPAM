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
        int elem=0;
        int k=6; int h=5;

        int[][] snake = new int[k][h];

        int a=0;
        int b=1;
        //if(snake[][] == k*h){System.out.println(Arrays.deepToString(snake));brake;}
           for (int i = 1; i < h+1 ; i++) {
               snake[b-b][a] = i;
                    a++;
                }
        System.out.println(Arrays.deepToString(snake));
        System.out.println(b + " " + a);
        for (int  i = h+1; i < h+k; i++) {
            snake[b][a-1] = i;
            b++;
        }System.out.println(Arrays.deepToString(snake));
        System.out.println(b + " " + a);
        for (int i = h+k-1; i < h*2+k-1 ; i++) {
            snake[k-1][a-1] = i;
            a--;
        }System.out.println(Arrays.deepToString(snake));
        System.out.println(a);
        for (int i = h*2+k-2; i < h*2+k*2-3 ; i++) {
            snake[b-1][a] = i;
            b--;
        }System.out.println(Arrays.deepToString(snake));
        System.out.println(b + " " + a);
        for (int i = h*2+k*2-3; i < h*3+k*2-5 ; i++) {
            snake[b][a+1] = i;
            a++;
        }
        System.out.println(Arrays.deepToString(snake));
        System.out.println(b + " " + a);


        Arrays.stream(snake).map(Arrays::toString).forEach(System.out::println);
    }
}
