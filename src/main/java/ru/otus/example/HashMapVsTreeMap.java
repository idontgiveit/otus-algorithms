package ru.otus.example;

import ru.otus.example.util.Measure;

import java.util.*;

public class HashMapVsTreeMap {
    static int SIZE = 100000;

    public static void main(String[] args) {
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        Measure.stamp();
        fill(treeMap);
        Measure.print();

        Measure.stamp();
        fill(hashMap);
        Measure.print();

        Measure.stamp();
        search(treeMap);
        Measure.print();

        Measure.stamp();
        search(hashMap);
        Measure.print();

        treeMap.headMap(30);
        System.out.println( treeMap.subMap(23, 44));



    }

    public static void fill(Map<Integer, Integer> map) {
        for (int i = 0; i < SIZE; i ++) {
            map.put(i, i);
        }
    }

    public static void search(Map<Integer, Integer> map) {
        for (int i = 0; i < SIZE; i ++) {
            map.get(i);
        }
    }
}
