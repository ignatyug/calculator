package com.yurgen.examplePackage;

import com.sun.tools.javac.util.ArrayUtils;

import java.util.*;

public class ExampleTask {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Введите 10 произвольных чисел: ");
        int size = 10;
        int[] sizeMas = new int[size];
        for (int i = 0; i < sizeMas.length; i++) {
            sizeMas[i] = input.nextInt();
        }
        for (int i = 0; i < sizeMas.length - 1; i++) {
            for (int j = i + 1; j < sizeMas.length; j++) {
                if (sizeMas[i] == sizeMas[j]) {
                    sizeMas = ArrayUtils.ensureCapacity(sizeMas, j);
                }
            }
        }
    }
}
//  Создать пустой  массив на десять элементов
//  Ввести ползоавтелю 10 элемнентов
//  Дубликаты не должны записываться