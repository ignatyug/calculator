package com.yurgen.tasks_java;

import java.sql.SQLOutput;

public class Number_sum {

    public static void main(String [] args){

        int g = 469654;

//        int a = 123 / 100;
//        int b = 123 / 10 % 10;
//        int c = 123 % 100;
        int z = 123 / 100 % 10;
        int f = 123 / 10 % 10;
        int d = 123 % 10;
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);
        System.out.println(z);
        System.out.println(f);
        System.out.println(d);
        System.out.println("Разбиение много значного числа " + "\n" + g + "\n на однозначные \n " + (((g / 100000) % 10) + " \n " +((g / 10000) % 10) + " \n " + ((g / 1000) % 10) + " \n " + (g / 100) % 10) + "\n " + ((g / 10) % 10) + "\n " + (g % 10));

        int i = 13579;
        String s = ""+i;
        System.out.println(s.length()+" цифр"+" последняя "+s.charAt(s.length()-1));


        int e = 23;
        int h = 3;
        int m = 35;
        int sum = ((e + h) - (m / e) + (m * e * e) - (e + h));
        System.out.println(sum);
    }
}
