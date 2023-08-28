package ru.otus.example;

import ru.otus.example.util.Measure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkedListVsArrayList {
    static int SIZE = 100000;

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        Measure.stamp();
        insert(arrayList);
        Measure.print();

        Measure.stamp();
        insert(linkedList);
        Measure.print();

    }

    static void insert(List<Integer> list) {
        for (int i = 0; i < SIZE; i ++) {
            if (i == 0) {
                list.add(i);
            }
            list.add(0, i);
        }
    }
}
