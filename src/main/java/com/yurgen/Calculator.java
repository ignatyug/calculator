package com.yurgen;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int left = in.nextInt();
        int right = in.nextInt();
        char operation = in.next().charAt(0);
        double result = 0;

        if (operation == '+') {
            result = left + right;
        } else if (operation == '-') {
            result = left - right;
        } else if (operation == '*') {
            result = left * right;
        } else if (operation == '/') {
            result = left / right;
        }
        System.out.println("Результат: " + left + " " + operation + " " + right + " = " + result);

    }

}
