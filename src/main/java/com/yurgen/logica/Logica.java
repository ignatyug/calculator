package com.yurgen.logica;

import java.util.Scanner;

public class Logica {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первый параметр: ");
        boolean x = Boolean.parseBoolean(in.next());
        System.out.print("Введите второй параметр: ");
        boolean y = Boolean.parseBoolean(in.next());

        // && - И
        // || - ИЛИ
        // ! - НЕТ
        if (x && y) {
            System.out.println("ИСТИНА");
        } else if ((x && !y) || (!x && y)) {
            System.out.println("50 НА 50");
        } else {
            System.out.println("ЛОЖЬ");
        }
    }

}
