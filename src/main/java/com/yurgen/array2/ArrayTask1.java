package com.yurgen.array2;

import java.util.Scanner;

public class ArrayTask1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        int size = in.nextInt();
        char[] mas = new char[size];
        for (int i = 0; i < mas.length; i++) {
            System.out.print("Введите єлемен: ");
            mas[i] = (char) in.nextInt();
            System.out.println(i + " - " + mas[i] + ": " + (int) mas[i]);
        }
    }
}