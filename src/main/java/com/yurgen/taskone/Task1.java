package com.yurgen.taskone;

public class Task1 {

    public static void main(String[] args) {
        System.out.println("Введите число: ");
        int a = 0;
        if (a >= 1) {
            System.out.println("Если Ваше число болбше нуля значит результат: " + "\n" + "ПОЛОЖИТЕЛЬНЫЙ");
            }else if (a == 0) {
                System.out.println("Если Ваше число равно нулю значит результат: " + "\n" + "НОЛЬ");
            } else {
                System.out.println("Если Ваше число меньше нуля значит результат: " + "\n" + "ОТРИЦАТЕЛЬНЫЙ");
            }
        }
    }
