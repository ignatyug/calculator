package com.yurgen.calculator;

import java.util.Scanner;

public class CalculatorPrinter {

    int left;
    int right;
    char operation;

    public CalculatorPrinter() {
        Scanner in = new Scanner(System.in);
        double result = 0;
        {
            System.out.println("Результат: " + left + " " + operation + " " + right + " = " + result);
            System.out.println("Ессли вы хотите продолжить введите значения после Y: ");


        }
    }
}

