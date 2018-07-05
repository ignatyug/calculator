package com.yurgen.utils;
import java.util.Scanner;
public class Utils {

    public static void main(String[] args) {
        isEmpty("abc");
        System.out.println(isEmpty(null));
        System.out.println(isNotEmpty(null));
    }

    private static boolean isEmpty(String a) {
        if (a == null || a.length() == 0) {
            return true;
        } else {
            return false;
        }
    }
    private static boolean isNotEmpty(String c) {
        if (c == null || c.length() == 0) {
            return false;
        } else {
            return true;

        }
    }
}


