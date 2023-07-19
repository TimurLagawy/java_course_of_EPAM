package com.epam.learn.main;

import java.util.Arrays;

public class TestArrayCopy {
    public static void main(String[] args) {
        int [] array = {12, 13, 14, 15};
        int [] bold = {90, 89, 88, 87, 86, 85, 84, 83};
       // System.arraycopy(array, 0, bold, 0, array.length);//вставить в другой массив с 0 элемента всю длину массива
       System.arraycopy(array, 2, bold, 4, array.length-2);//вставить часть массива в середину
        System.out.println(Arrays.toString(bold));
    }
}
