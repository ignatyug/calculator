package com.yurgen.examplePackage;

import java.util.Scanner;

public class ExampleTask4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Введите значение: ");
//        String [] newMas = new String[10];
//        for (int i = 0; i < sizeMas.length; i++) {
//            sizeMas[i] = input.nextInt();
        String newMas = input.nextLine();

        for (;;) {
            if (newMas == "stop") {
                break;

            }
        }
        System.out.println();
    }
}


