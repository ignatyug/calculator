package com.yurgen.masnew;

public class MasNew {
    public static void main(String[] args) {
        String[] a = {"fifth", "twentieth",  "first", "tenth"};
        String s = "first";
        boolean b = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == s) {
                System.out.println(i);
                b = true;
            }
        }
        if (b==false) {
            System.out.println("no");
        }
    }
}