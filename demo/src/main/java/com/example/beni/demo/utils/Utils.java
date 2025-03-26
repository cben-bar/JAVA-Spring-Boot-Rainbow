package com.example.beni.demo.utils;

import java.beans.JavaBean;

@JavaBean
public class Utils {
    public static void freeStringDisplay(String txt) {
        System.out.println(txt);
    }

    public static void recursiveFunction(final int iterator) {
        if (iterator >= -1) {
            System.out.println("Iterator = " + iterator);
            recursiveFunction(iterator - 1);}
    }
}
