package com.yurgen.mas;

public class TaskMas4 {

    public static void main(String[] args) {

        char[] mas = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
        for (int i = 0; i < mas.length; i++) {
            System.out.println(String.format("%d - %s: %d",i,mas[i],(int)mas[i]));
        }
    }
}