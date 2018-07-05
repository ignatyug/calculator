package com.yurgen.excel;

public class ExcelTask1 {

    public static void main(String[] args) {
        int[] number = {1, 2, 3, 4, 5, -1, -2, -3, -4, -5};
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < number.length; i++) {
            if (number[i] < 0) {
                sum1 += number[i];
                System.out.print(sum1 + "\t");
            }
        }
        System.out.print("\n");

        for (int b = 0; b < number.length; b++) {
            if (number[b] > 0) {
                sum2 += number[b];
                System.out.print(sum2 + "\t");
            }
        }
    }
}


