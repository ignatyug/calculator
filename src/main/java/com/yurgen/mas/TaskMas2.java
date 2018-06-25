package com.yurgen.mas;

import java.util.Scanner;

public class TaskMas2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] mas = {2, 4, 6, 8, 9,};
        System.out.print("Укажите любое число: ");
        for (int i = 0; i < mas.length; i++) {
            mas[i] = in.nextInt();
            if (mas[i] <= mas.length) {
                System.out.println("Вы ввели число которое соответствуе заданому параметру: ");
            } else {
                System.out.println("Вы ввели число котрое не соответствует не одному параметру: ");
            }
        }
    }
}


