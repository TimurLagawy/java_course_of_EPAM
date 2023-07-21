package com.epam.learn.main;

import java.util.Arrays;

public class TestArrayCopy {
    public static void main(String[] args) {
//        int [] array = {12, 13, 14, 15};
//        int [] bold = {90, 89, 88, 87, 86, 85, 84, 83};
//       // System.arraycopy(array, 0, bold, 0, array.length);//вставить в другой массив с 0 элемента всю длину массива
//       System.arraycopy(array, 2, bold, 4, array.length-2);//вставить часть массива в середину
//        System.out.println(Arrays.toString(bold));

//        int[] arr1 = {1,2,3,4,5,6,7,8,9};
//        int[] arr2 = {1,2,3,4,5,6,7,8,9};
//        int[] arr3 = {1,2,5,5,5,5,5,8,9};
//       // System.out.println(arr1 == arr2);
//        System.out.println(Arrays.equals(arr1, arr2));
//        System.out.println(Arrays.equals(arr1, arr3));

//        int intArr[] = {10, 15, 18, 18, 19, 27, 38, 39, 51, 55, 55, 57, 61, 66, 83, 95};
//        int searchVal = 55;
//        int retVal = Arrays.binarySearch(intArr, searchVal);
//        System.out.println("The index of element 55 is : " + retVal);
        int[][] array = { { 1, 2, 3 }, { 4, 5, 6 }, { 7 } };
        int[][] anotherArray = { { 1, 2, 3 }, { 4, 5, 6 }, { 7 } };
        System.out.println(Arrays.equals(array, anotherArray));
        System.out.println(Arrays.deepEquals(array, anotherArray));
    }
}
