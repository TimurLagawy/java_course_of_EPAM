package com.epam.learn.main;

public class Test {
    public static void main(String[] args) {
        String[] strArray = new String[] {"One", "Two", "Three"};
        strArray[2] = null;
        for (String val : strArray)
            System.out.print(val + ", ");
    }
}
