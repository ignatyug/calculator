package com.yurgen.TaskFactorial;
import java.util.Scanner;
public class FactOne {
    /**
     * Посчитать факториал заданного числа с помощью цикла.
     * Факториал это умножение всех чисел от 1 до заданного.
     * Например: факториал числа 2 = 1*2, факториал числа 3 = 1*2*3, факториал числа 4 = 1*2*3*4 и т.д....
     * В программе должна быть переменная типа int в которую вводится заданное число, дальше в цикле идем
     * подсчет и результат выводиться на экран.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n; n = scan.nextInt();
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
            System.out.println("Факториал: " + result);
        }
    }
