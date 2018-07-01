package com.yurgen.utils;
import java.util.Scanner;
public class Utils {

    public static void main(String[] args) {
        isEmpty("abc");
        System.out.println(isEmpty(null));
    }

    private static boolean isEmpty(String a) {
        if (a != " ") {
            return true;
        } else {
            return false;
        }
    }
    private static boolean isNotEmpty(String c) {
        if (c != " ") {
            return false;
        } else {
            return true;

        }
    }
}


