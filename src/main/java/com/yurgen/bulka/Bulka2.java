package com.yurgen.bulka;

public class Bulka2 {

    public static void main(String[] args) {

        boolean a = true;
        boolean b = true;
        doubleBoolean(a,b);

    }

    private static void doubleBoolean(boolean a, boolean b) {
        if (a && b) {
            System.out.println("1");
        } else {
            System.out.println("2");
        }
    }
}

