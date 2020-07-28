package com.yurgen.examplePackage;

//import com.sun.tools.javac.util.ArrayUtils;

import java.util.*;

public class ExampleTask {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Введите 10 произвольных чисел: ");
        int size = 10;
        int[] newMas = new int[size];
        int[] sizeMas = new int[size];
        for (int i = 0; i < sizeMas.length; i++) {
            sizeMas[i] = input.nextInt();

        }
        boolean stopSequence = false;
        for (int i = 0; i < sizeMas.length; i++){
            for (int a = 0; a < newMas.length && !stopSequence;){
                if (sizeMas[i] != newMas[a]){
                    sizeMas[i] = 0;
                    a++;
                }
                if (sizeMas[i] == newMas[a]){
                    sizeMas[i] = 0;
                    stopSequence = true;
                }
            }
            stopSequence = false;
        }
        System.out.println(sizeMas);
    }
}
//  Создать пустой  массив на десять элементов
//  Ввести ползоавтелю 10 элемнентов
//  Дубликаты не должны записываться