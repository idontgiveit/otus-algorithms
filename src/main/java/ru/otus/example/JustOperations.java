package ru.otus.example;

public class JustOperations {
    public static void main(String[] args) {
        int n = 100;
        int m = 100;

        for (int i = 0; i < n; i ++) {
            for (int j = 0; j < n; j ++) {
                foo(i);
            }
        }


    }

    public static void foo(int i) {
        int j = (i * 5) ^ 2 ;
    }
}
