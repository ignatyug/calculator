package com.yurgen.taskone;

public class Task2 {

    public static void main(String[] args) {

        int a = 8;
        if (a == 0) {
            System.out.println("Вы ввели число: " + "\n" + "НОЛЬ");
        } else if (a == 1) {
            System.out.println("Вы ввели число: " + "\n" + "ОДИН");
        } else if (a == 2) {
            System.out.println("Вы ввели число: " + "\n" + "ДВА");
        } else if (a == 3) {
            System.out.println("Вы ввели число: " + "\n" + "ТРИ");
        } else if (a == 4) {
            System.out.println("Вы ввели число: " + "\n" + "ЧЕТЫРЕ");
        } else if (a == 5) {
            System.out.println("Вы ввели число: " + "\n" + "ПЯТЬ");
        } else {
            System.out.println("Вы ввели число котрое не соответствует не одному параметру: " + "\n" + "РЕЗУЛЬТАТ ОТРИЦАТЕЛЬНЫЙ");
        }
    }
}
