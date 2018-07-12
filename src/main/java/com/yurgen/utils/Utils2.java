package com.yurgen.utils;

public class Utils2 {

    public static void main(String[] args) {
        isBlank(null);
        isBlank("");
        isBlank(" ");
        isBlank("bob");
        isBlank("  bob  ");
        System.out.println(isBlank(null));
        System.out.println(isNotBlank("abc"));
    }

    private static boolean isBlank(String a) {
        if (a == null || a.length() == 0) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean isNotBlank(String c) {
        if ((c == "abc") || (c.length() == 0)) {
            return false;
        } else {
            return true;

        }
    }
}
