package com.epam.learn.main;

import java.util.Scanner;

public class GoDutch {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
int bill, friends;
bill = scanner.nextInt();
friends = scanner.nextInt();
if (friends<1) {
            System.out.println("Number of friends cannot be negative or zero");
        }else if (bill<0){
            System.out.println("Bill total amount cannot be negative");
        }else{int check = bill*110/100/friends; System.out.println(check);
      }
    }
}
