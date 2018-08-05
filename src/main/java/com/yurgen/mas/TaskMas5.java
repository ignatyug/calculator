package com.yurgen.mas;

public class TaskMas5 {

    public static void main(String[] args) {
        int[] mas = {2, 4, 6, 8, 9};
        int element = 2;
        boolean found = false;
        for (int i = 0; i < mas.length; i++) {
            if (element == mas[i]) {
                found = true;
                break;
            }
        }
        if (found == false){
            System.out.println("NOT FOUND");
        }else {
            System.out.println("НАЙДЕН");

        }
    }
}


