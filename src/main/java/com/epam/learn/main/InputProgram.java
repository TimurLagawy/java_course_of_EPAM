package com.epam.learn.main;

import java.io.IOException;

public class InputProgram {
    public static void main(String[] args) {
        int x;
        try {
            x = System.in.read();
            System.out.println("code = " + x + "\n" + " x= " + (char)x );
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
