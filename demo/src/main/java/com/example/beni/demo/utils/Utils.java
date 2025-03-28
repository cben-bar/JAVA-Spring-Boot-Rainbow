package com.example.beni.demo.utils;

public class Utils {
    public static void freeStringDisplay(String txt) {
        System.out.println(txt);
    }

    public static void recursiveFunction(final int iterator) {
        if (iterator >= -1) {
            System.out.println("Iterator = " + iterator);
            recursiveFunction(iterator - 1);}
    }

    public static void isRank(final int rank) {
        switch (rank) {
            case 1 -> System.out.println("Little");
            case 5 -> System.out.println("Medium");
            case 10 -> System.out.println("Faaaat");
            default -> System.out.println("I don't know!");
        }
    }
}
