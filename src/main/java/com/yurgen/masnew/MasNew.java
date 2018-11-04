package com.yurgen.masnew;

import java.util.Locale;

public class MasNew {
    public static void main(String[] args) {
        String[] a = {"fifth", "twentieth",  "first", "tenth"};
        String s = new String ("FI");
        boolean b = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i].startsWith(s.toLowerCase())) {
                System.out.println(i);
                b = true;
            }
        }
        if (!b) {
            System.out.println("no");
        }
    }
}