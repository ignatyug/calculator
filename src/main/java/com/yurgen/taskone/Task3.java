package com.yurgen.taskone;
public class Task3 {
    public static void main(String[] args) {

        int number = 8;
        switch (number) {
            case 0:
                System.out.println("Вы ввели число: " + "\n" + "НОЛЬ");
                break;
            case 1:
                System.out.println("Вы ввели число: " + "\n" + "ОДИН");
                break;
            case 2:
                System.out.println("Вы ввели число: " + "\n" + "ДВА");
                break;
            case 3:
                System.out.println("Вы ввели число: " + "\n" + "ТРИ");
                break;
            case 4:
                System.out.println("Вы ввели число: " + "\n" + "ЧЕТЫРЕ");
                break;
            case 5:
                System.out.println("Вы ввели число: " + "\n" + "ПЯТЬ");
                break;

            default:
                System.out.println("Вы ввели число котрое не соответствует не одному параметру: " + "\n" + "РЕЗУЛЬТАТ ОТРИЦАТЕЛЬНЫЙ");
                break;
        }
    }
}


