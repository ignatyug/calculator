package com.yurgen.masnew;

public class MasNew {
    public static void main(String[] args) {
        String[] a = {"fifth", "twentieth",  "first", "tenth"};
        String s = new String ("fIrST");
        boolean b = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i].equals(s)) {
                System.out.println(i);
                b = true;
            }
        }
        if (!b) {
            System.out.println("no");
        }
    }
}