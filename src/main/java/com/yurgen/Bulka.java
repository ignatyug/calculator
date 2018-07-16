package com.yurgen;

public class Bulka {

    public static void main(String[] args) {
        singleBoolean (true);
    }
    static boolean singleBoolean (boolean a) {
        if (a) {
            System.out.println("1");
        } else {
            System.out.println("2");
        }
        return a;
    }
}

