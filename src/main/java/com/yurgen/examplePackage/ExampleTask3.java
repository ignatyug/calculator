package com.yurgen.examplePackage;

import java.util.Scanner;

public class ExampleTask3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String size;
//        for (; ;) {
            do {
                System.out.println("Введите значение: ");
                size = input.nextLine();

            } while (!"stop".equals(size));
            System.out.print("Ok");
        }
    }
//}


