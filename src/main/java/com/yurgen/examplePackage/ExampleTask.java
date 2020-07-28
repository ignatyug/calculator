package com.yurgen.examplePackage;

//import com.sun.tools.javac.util.ArrayUtils;

import java.util.*;

public class ExampleTask {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Введите 10 произвольных чисел: ");
        int size = 10;
        int[] newMass = new int[size];
        int[] sizeMas = new int[size];
        for (int i = 0; i < sizeMas.length; i++) {
            sizeMas[i] = input.nextInt();
        }
        for (int i = 0; i < sizeMas.length; i++) {
            for (int j = 0; j < newMass.length; j++) {
                if (newMass[j] == sizeMas[i]) {
                    break;
                }
            }
            newMass[i] = sizeMas[i];
        }
    }
}
//  Создать пустой  массив на десять элементов
//  Ввести ползоавтелю 10 элемнентов
//  Дубликаты не должны записываться