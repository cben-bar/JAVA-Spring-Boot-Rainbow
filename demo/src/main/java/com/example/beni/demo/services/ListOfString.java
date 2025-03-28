package com.example.beni.demo.services;

import java.util.Arrays;
import java.util.List;

public class ListOfString {
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public static List<String> parsList(String a, String b, String c) {
        List<String> parsString = Arrays.asList(a, b, c);
        return parsString;
    }

    public static void displayList(List<String> lstString) {
        for (String element : lstString) {
            System.out.println(element);
        }
    }
    
}
