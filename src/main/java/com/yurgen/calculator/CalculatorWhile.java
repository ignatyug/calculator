package com.yurgen.calculator;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.Scanner;

public class CalculatorWhile {

    public static void main(String[] args) {
        String y = "";
        boolean первыйЗапуск = true;
        while (первыйЗапуск || y.equalsIgnoreCase("y")) {
            Scanner in = new Scanner(System.in);
            System.out.print("Введите первое число: ");
            int left = in.nextInt();
            System.out.print("Введите второе число: ");
            int right = in.nextInt();
            System.out.print("Введите аперацию: ");
            final char operation = in.next().charAt(0);
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
              System.out.println("Ессли вы хотите продолжить введите значения после Y: ");
            y = in.next();
            первыйЗапуск = false;
        }
    }
    }


