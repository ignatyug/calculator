package com.yurgen.calculator;

import java.util.Scanner;

public class CalculatorFor {


    public static void main(String[] args) {
        boolean первыйЗапуск = true;
        for (String y = ""; первыйЗапуск || y.equalsIgnoreCase("y"); первыйЗапуск = false) {
            Scanner in = new Scanner(System.in);
            System.out.print("Введите первое число: ");
            int left = in.nextInt();
            System.out.print("Введите второе число: ");
            int right = in.nextInt();
            System.out.print("Введите аперацию: ");
            final char operation = in.next().charAt(0);
            Calculator calculator = new Calculator(left, right,operation);

            double result = calculator.calculate();

            System.out.println("Результат: " + left + " " + operation + " " + right + " = " + result);
            System.out.println("Ессли вы хотите продолжить введите значения после Y: ");
            y = in.next();
        }
    }
}


