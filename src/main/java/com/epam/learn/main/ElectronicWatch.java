package com.epam.learn.main;

import java.util.Scanner;

public class ElectronicWatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seconds = scanner.nextInt();
        int sec = seconds % 60;
        int minutes = seconds / 60;
        int min = minutes % 60;
        int hours = seconds / 3600;
        int hr = hours % 24;
        System.out.print(hr + " : ");
        if (min < 10) {
            System.out.print("0" + min);
        } else {
            System.out.print(min);}
            if (sec < 10) {
                System.out.print(" : 0" + sec);
            } else {

                System.out.print(" : " + sec);
            }

        }
    }
