package com.yurgen.com.multiplication.table;

public class Программа {

    public static void main(String[] args) {
        MultiplicationTеable number = new MultiplicationTеable(9);
        System.out.println("\nСейчас будет напечатана таблица для числа: "+ number.getNumber());
        number.print();
    }

}
