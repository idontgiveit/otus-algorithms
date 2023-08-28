package ru.otus.example;

import ru.otus.example.util.Measure;

import java.util.*;

public class SetVsList {
    static int SIZE = 100000;

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        HashSet<Integer> hashSet = new HashSet<>();

        Measure.stamp();
        insert(arrayList);
        Measure.print();

        Measure.stamp();
        insert(hashSet);
        Measure.print();


        Machine m1  = new Machine("GAS");
        Machine m2  = new Machine("ATOMIC");
        Machine m3  = new Machine("HYDROGEN");

        Set<String> deprecatedTypes = Set.of("GAS");

        System.out.println(deprecatedTypes.contains(m1.type));


    }

    static void insert(Collection<Integer> list) {
        for (int i = 0; i < SIZE; i ++) {
            list.add(i);
        }
    }

    static void search(Collection<Integer> list) {
        for (int i = 0; i < SIZE; i ++) {
            list.contains(i);
        }
    }

    static class Machine {
        String type;

        public Machine(String type) {
            this.type = type;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }
    }
}
