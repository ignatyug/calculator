package com.yurgen.excel;

public class ExcelTask1 {

    public static void main (String[] args) {
        int [][] number = {{36,1,51},{12,40,6},{7,18,9}};

        for (int i=0; i<number.length; i++) {
            for(int j=0; j<number[j].length; j++) {
                System.out.print (number [i][j]+ "\t");
            }
            System.out.println();
        }
        int summ=0;
        for(int i=0; i<2; i++) {
            for (int j=0; j<2; j++) {
                if (number[i][j]>35) summ=number[i][j];

            }
        }
        System.out.println(summ+" ");

    }
    }
