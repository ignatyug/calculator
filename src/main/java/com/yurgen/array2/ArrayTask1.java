package com.yurgen.array2;

import java.util.Scanner;

//import static sun.misc.Version.print;

public class ArrayTask1 {

    public static void main(String[] args) {
        System.out.print("Введите длину массива: ");
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        char[] mas = new char[size];
        launch(in, mas);
        conclusion(mas);

    }

    private static void launch(Scanner in, char[] mas) {
        for (int i = 0; i < mas.length; i++) {
            System.out.print("Введите єлемен: ");
            mas[i] = in.next().charAt(0);
        }
    }

    private static void conclusion(char[] mas) {
        for (int i = 0; i < mas.length; i++) {
            System.out.println(i + " - " + mas[i] + ": " + (int) mas[i]);
        }
    }
}


