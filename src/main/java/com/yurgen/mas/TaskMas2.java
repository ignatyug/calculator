package com.yurgen.mas;

import java.util.Scanner;

public class TaskMas2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Укажите любое число: ");
        int[] mas = {2, 4, 6, 8, 9,};
        for (Integer a : mas) {
            for (int i = 0; i < mas.length; i++) {
                System.out.print("Введите єлемен: ");
                mas[i] = in.nextInt();
                System.out.println(String.format("Ты ввел %d * 2 = %d", mas[i], mas[i] * 2));
            }
        }
    }
}