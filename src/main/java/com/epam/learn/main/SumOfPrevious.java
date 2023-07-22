package com.epam.learn.main;

import java.util.Arrays;

public class SumOfPrevious {
//    public static void main(String[] args) {
//        int[] array = {1, -1, 0, 4, 6, 10, 15, 25};
//        if(array.length<3){
//            System.out.println(false);
//        }else{
//        System.out.print("false false ");
//
//        for (int i = 2; i < array.length; i++) {
//            if (array[i] == (array[i-1] + array[i-2])){
//                System.out.print("true ");
//        }else {
//                System.out.print("false ");
//
//                //put your code here
//
//            }}}
//    }
//}
public static void main(String[] args) {
    int[] array = new int[]{1, -1, 0, 4, 6, 10, 15, 25};

    System.out.println(Arrays.toString(getSumCheckArray(array)));
}

    public static boolean[] getSumCheckArray(int[] array){
    int n = array.length;
    boolean[] result = new boolean[n];
    result[0] = false;
    result[1] = false;

            for (int i = 2; i < array.length; i++) {
                if (array[i] == array[i-1] + array[i-2]){
                    result[i] = true;
                }else {
                    result[i] = false;
            }

        }

        return result;

    }}

