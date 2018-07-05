package com.yurgen.excel;

public class ExcelTask1 {

    public static void main(String[] args) {
        int[] number = {1, 2, 3, 4, 5, -1, -2, -3, -4, -5};
        for (int i = 0; i < number.length; i++) {
            if (number[i] > 0)
            System.out.print(number[i] + "\t");
        }
    }
}

