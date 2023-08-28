package ru.otus.example;

import ru.otus.example.util.Measure;

public class LuckyTickets {
    public static void main(String[] args) {


        Measure.stamp();
        int ctr = 0;
        for (int a = 0; a < 10; a ++) {
            for (int b = 0; b < 10; b ++) {
                for (int c = 0; c < 10; c ++) {
                    for (int a1 = 0; a1 < 10; a1 ++) {
                        for (int b1 = 0; b1 < 10; b1 ++) {
                            for (int c1 = 0; c1 < 10; c1 ++) {
                                if ((a + b + c) == (a1 + b1 + c1)) {
                                    ctr ++;
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println(ctr);
        Measure.print();

        Measure.stamp();
        ctr = 0;
        for (int i = 0; i < 1000; i ++) {
            for (int j = 0; j < 1000; j ++) {

                if (getSum(i) == getSum(j)) {
                    ctr ++;
                }
            }
        }
        System.out.println(ctr);
        Measure.print();

        Measure.stamp();
        ctr = 0;
        for (int i = 0; i < 1000000; i ++) {
                if (getSum(i / 1000) == getSum(i - ((i / 1000) * 1000))) {
                    ctr ++;
                }
        }
        System.out.println(ctr);
        Measure.print();

    }
    public static int getSum(int i) {
        int high = i / 100;
        int high100 = high * 100;
        int middle = (i - high100) / 10;
        int low = i - high100 - middle * 10;

        return  high + middle + low;
    }
}
