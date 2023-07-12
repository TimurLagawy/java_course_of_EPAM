package com.epam.learn.main;

import java.util.Locale;
import java.util.Scanner;



public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        double x1, x2;
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        x1 = (-b - Math.sqrt(b*b - 4*a*c))/(2*a);
        x2 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
        if (x1 == 0) {
            System.out.println(0.0);
        } else if (x1 == x2){
                System.out.println(x1);
        } else if ((b * b - 4 * a * c) < 0) {
            System.out.println("no roots");
        }else{
            System.out.print(x1 + " " + x2);
    }}
}
