package com.yurgen.tasks_java;

public class SumDouble {
/*
Given two int values, return their sum. Unless the two values are the same, then return double their sum.
 */
    public static void main(String[]args){

    }
    public int sumDouble(int a, int b) {
        // Store the sum in a local variable
        int sum = a + b;

        // Double it if a and b are the same
        if (a == b) {
            sum = sum * 2;
        }

        return sum;
    }
}
