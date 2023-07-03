package com.epam.learn.main;

import java.util.Scanner;

public class Snail {
    public static void main(String[] args) {
       /* Scanner scanner = new Scanner (System.in);
        String nums = scanner.nextLine();
        System.out.println(nums);
        String [] parts = nums.split(System.lineSeparator());

        int a1  = Integer.parseInt(parts[0]);
        int b1 = Integer.parseInt(parts[1]);
        int top1 = Integer.parseInt(parts[2]);

        System.out.println();

        for (int i = 1; i <= 15 ; i++) {
            int h1 = a1 * i;
            h1 = (h1 - (b1 * (i - 1)));
            if (h1 >= top1) {
                String num = ("" + i + ", " + a1 + ", " + b1 + ", " + top1);
                System.out.println(num);
                break;
            }
            if( i >14){
                String impos = ("Impossible" + ", " + a1 + ", " + b1 + ", " + top1);
                System.out.println(impos);
                break;
            }
        }
    }*/

            Scanner scanner = new Scanner (System.in);
            int a, b, h;
            a = scanner.nextInt();
            b = scanner.nextInt();
            h = scanner.nextInt();

            for (int i = 1; i <= 15 ; i++) {
                int h1 = a * i;
                h1 = (h1 - (b * (i - 1)));
                if (h1 >= h) {
                    System.out.println(i);
                    break;
                }
                if( i >14){System.out.println("Impossible");
                    break;
                }
            }
        }
    }

