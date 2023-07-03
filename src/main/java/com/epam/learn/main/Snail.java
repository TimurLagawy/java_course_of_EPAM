package com.epam.learn.main;

import java.util.Scanner;

public class Snail {
    public static void main(String[] args) {
        Scanner scannerA = new Scanner (System.in);
        int a = scannerA.nextInt();
        Scanner scannerB = new Scanner (System.in);
        int b = scannerB.nextInt();
        Scanner scannerH = new Scanner (System.in);
        int h = scannerH.nextInt();

        for (int i = 1; i <= 15 ; i++) {
            int h1 = a * i;
            h1 = (h1 - (b * (i - 1)));
            if (h1 >= h) {
                System.out.println(i);
                break;
            }
            if( i >14){System.out.println("Impossible");
                break;}
            }
        }
}
