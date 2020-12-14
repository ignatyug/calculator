package com.yurgen.tasks_java;

public class Sum_All_Numbers {

    public static void main(String[] args) {
        int a = 678;
        System.out.println("Сумма всех чисел " + a + " равна " + ((a % 10) + ((a / 10) % 10) + (a / 100) % 10));
    }
}
