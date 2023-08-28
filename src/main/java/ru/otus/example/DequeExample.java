package ru.otus.example;

import java.util.Deque;
import java.util.LinkedList;

public class DequeExample {
    public static void main(String[] args) {

        Deque<Integer> deque = new LinkedList<>();


        deque.addFirst(1);
        deque.addFirst(2);
        deque.addFirst(3);

        while (!deque.isEmpty()) {
            System.out.println(deque.pollFirst());
        }


    }
}
