package com.yurgen.array;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkList {
    public static void main(String[] args) {
        List<Integer> linkList = new LinkedList<>();
        List<Integer> arrayList = new ArrayList<>();

        measureTime(linkList);
        measureTime(arrayList);
    }

    public static void measureTime(List<Integer> List) {

//        for (int i = 0; i < 100000; i++) {
//            List.add(i);
//        }
        long start = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            List.add(0, i);

        }

        long and = System.currentTimeMillis();

        System.out.println(and - start);


    }
}
