package com.epam.learn.main;

import java.util.Arrays;

public class LocalMaximaRemove {
    public static void main(String[] args) {
        int[] array = {18, 1, 3, 6, 7, -5};
//        int searchMax=0;
//        for (int i = 0; i < intArray.length; i++) {
//            if(i == 0 && intArray[i]>intArray[i+1]){
//                searchMax = intArray[i];
//                System.out.println(searchMax);
//            } else if (i == intArray.length && intArray[i]>intArray[i-1]) {
//                searchMax = intArray[i];
//                System.out.println(searchMax);
//            }else if( intArray[i]>intArray[i-1] && intArray[i]>intArray[i+1]) {
//                searchMax = intArray[i];
//            }System.out.println(searchMax);
//        }
//
//
//        int max = intArray[0];
//        for( int value : intArray){
//            if( max < value){
//                max = value;
//            }
//        }System.out.println(max);
//
        System.out.println(Arrays.toString(removeLocalMaxima(array)));
    }

    public static int[] removeLocalMaxima(int[] array) {

//        int searchMax;
//        for (int i = 0; i < array.length; i++) {
//
//            if (i == array.length-1 && array[i] > array[i - 1]   ) {
//                searchMax = array[i];
//                System.out.println(searchMax);
//
//            }
//        }
//        for (int k = 0; k < array.length; k++) {
//            if (k == 0 && array[k] > array[k + 1]) {
//                searchMax = array[k];
//                System.out.println(searchMax);
//
//            }
//        }
//        for (int j = 1; j < array.length - 1; j++) {
//            if (array[j] > array[j - 1] && array[j] > array[j + 1]) {
//                searchMax = array[j];
//                System.out.println(searchMax);
//            }
//        }
       /* for (int k = 0; k < array.length; k++) {
            if (k == 0 && array[k] > array[k + 1]
                    || k == array.length-1 && array[k] > array[k - 1]
                    || k>=1 && array[k] > array[k - 1] && array[k] > array[k + 1]) {
                System.out.println(k);}}*/

        int[] result = new int[array.length];
        int resultIndex = 0;
       for (int k = 0; k < array.length; k++) {
            if ( k == 0 && array[k] > array[k + 1]
                    || k == array.length-1 && array[k] > array[k - 1]
                    || k>=1 && array[k] > array[k - 1] && array[k] > array[k + 1]){
                System.out.print(k);

            }else{result[resultIndex] = array[k];
                resultIndex++;
            }
        }
        return  Arrays.copyOf(result, resultIndex);
    }}