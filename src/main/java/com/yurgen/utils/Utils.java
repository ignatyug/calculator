package com.yurgen.utils;
import java.util.Scanner;
public class Utils {

    public static void main(String[] args) {
        isBlank(null);
        isBlank(" ");
        isNotBlank("abc");
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
        if (c == null || c.length() == 0) {
            return false;
        } else {
            return true;

        }
    }
}


