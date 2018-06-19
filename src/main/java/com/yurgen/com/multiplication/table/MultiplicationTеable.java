package com.yurgen.com.multiplication.table;

public class MultiplicationTеable {

    int number;

    public MultiplicationTеable(int number) {
        this.number = number;
    }

    public void print() {
        for (int i = 1; i <= number; i++) {
            System.out.println();
            for (int a = 1; a <= number; a++) {
                System.out.print("\t" + i * a);
            }
        }
    }

    int getNumber() {
        return number;
    }
}