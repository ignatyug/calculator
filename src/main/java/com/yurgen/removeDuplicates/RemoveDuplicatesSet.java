package com.yurgen.removeDuplicates;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RemoveDuplicatesSet {


    public static void main(String[] args) {
        int[] numbers = new int[] {5, 5, 6, 6, 7, 7, 7, 7, 8, 9};
        System.out.println(Arrays.toString(removeDuplicates(numbers)));
    }

    static int[] removeDuplicates(int[] numbers) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < numbers.length; i++){
            set.add(numbers[i]);
        }
        int[] releas = new int[set.size()];
        Iterator<Integer> iterator = set.iterator();
        //hasNext() - true/false
        //next() - element
        int d = 0;
        while (iterator.hasNext()) {
            int x = iterator.next();
            releas[d++] = x;

        }
        return  releas;
    }
}
