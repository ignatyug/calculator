package com.yurgen.array;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class LinkedHashMap {
    public static void main(String[] args){
        Map<Integer,String> hashMap = new HashMap<>();
        Map<Integer, String> linkedHashMap = new java.util.LinkedHashMap<>();
        Map<Integer, String> treeMap = new TreeMap<>();

        testMap(hashMap);
        System.out.println();
        testMap(linkedHashMap);
        System.out.println();
        testMap(treeMap);

    }
    public static void testMap (Map<Integer,String> map){
        map.put(24, "Roy");
        map.put(33, "Frank");
        map.put(15, "Roz");
        map.put(65, "Klark");
        for (Map.Entry<Integer, String> entry : map.entrySet()){
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }

}
