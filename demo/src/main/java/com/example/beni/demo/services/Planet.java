package com.example.beni.demo.services;

public record Planet(String name, double perimeter, double aarea) {
    public String getName() {
        return name;
    }
}