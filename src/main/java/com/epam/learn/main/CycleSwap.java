package com.epam.learn.main;

import java.util.Arrays;

public class CycleSwap {
    //public static void main(String[] args) {//сдвиг массива вправо
    /* public static void main(String[] args) {
        
        
         int shift = 2;
         int[] array = new int[]{1, 2, 3, 4, 5, 5, 6, 7, 8, 9};
         int[] result = new int[array.length];
         if(shift <= 0){
             System.arraycopy(array, 0, result, 1, array.length - 1);

             System.arraycopy(array, array.length - 1, result, 0, 1);
             System.out.println(Arrays.toString(result));}
         else if(array.length <= shift){
             System.out.println(Arrays.toString(array));

         }else{
             System.arraycopy(array, 0, result, shift,array.length-shift);
         System.arraycopy(array, array.length - shift, result, 0, shift);
         System.out.println(Arrays.toString(result));


     }
  array = result;
 } *//*
    public static void cycleSwap(int[] array) {
        if (array == null || array.length <= 1) {
            return;
        }

        int lastElement = array[array.length - 1];
        shiftArrayRight(array, array.length - 1);
        array[0] = lastElement;
    }

    public static void cycleSwap(int[] array, int shift) {
        if (array == null || array.length <= 1) {
            return;
        }

        shift = shift % array.length; // Normalize the shift value to the array length

        if (shift == 0) {
            return;
        }

        int[] temp = new int[shift];
        for (int i = array.length - shift, j = 0; i < array.length; i++, j++) {
            temp[j] = array[i];
        }

        shiftArrayRight(array, shift);

        for (int i = 0; i < shift; i++) {
            array[i] = temp[i];
        }
    }

    private static void shiftArrayRight(int[] array, int shift) {
        if (shift <= 0) {
            return;
        }

        int lastElement = array[array.length - 1];
        shiftArrayRight(array, shift - 1);
        array[shift] = array[shift - 1];
    }*/
        /*static void cycleSwap ( int[] array){
             int[] array = new int[]{1, 3, 2, 7, 4};
             CycleSwap.cycleSwap(array);
            if (array == null || array.length == 0) return;
            else {
                int temp = array[array.length - 1];
                int[] array1 = new int[array.length];
                System.arraycopy(array, 0, array1, 0, array.length);
                for (int i = 1; i < array.length; i++) {
                    array[i] = array1[i - 1];
                }
                array[0] = temp;
            }
        }

        /*static void cycleSwap ( int[] array, int shift){

            if (array == null || array.length == 0) return;
            else {
                int[] array1 = new int[shift];
                int[] copyArray = new int[array.length];
                System.arraycopy(array, 0, copyArray, 0, array.length);
                System.arraycopy(array, array.length - shift, array1, 0, shift);
                for (int i = 0; i < array.length - shift; i++) {
                    array[i + shift] = copyArray[i];
                }
                for (int i = 0; i < array1.length; i++) {
                    array[i] = array1[i];
                }
            }
        }*/
}