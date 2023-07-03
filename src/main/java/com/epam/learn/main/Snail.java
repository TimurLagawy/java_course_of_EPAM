package com.epam.learn.main;

import java.util.Scanner;

public class Snail {
    public static void main(String[] args) {
        Scanner scannerA = new Scanner (System.in);
        String a = scannerA.nextLine();
        Scanner scannerB = new Scanner (System.in);
        String b = scannerB.nextLine();
        Scanner scannerTop = new Scanner (System.in);
        String top = scannerTop.nextLine();

        int a1  = Integer.parseInt(a);
        int b1 = Integer.parseInt(b);
        int top1 = Integer.parseInt(top);

        for (int i = 1; i <= 15 ; i++) {
            int h1 = a1 * i;
            h1 = (h1 - (b1 * (i - 1)));
            if (h1 >= top1) {
                String nums = ("" + i + ", " + a + ", " + b + ", " + top);
                System.out.println(nums);
                break;
            }
            if( i >14){
                String impos = ("Impossible" + ", " + a + ", " + b + ", " + top);
                System.out.println(impos);
                break;
            }
        }
    }
}
