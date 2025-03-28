package com.example.beni.demo.services;

public class Test {
    public static ListOfString listStringInTest() {
        ListOfString instanceOfString = new ListOfString();

        System.out.println("getter in Test");
        instanceOfString.getDescription();
    
        return instanceOfString;
    }
}
