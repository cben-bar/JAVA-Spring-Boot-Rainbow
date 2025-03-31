package com.example.beni.demo.services;

public interface IBloc {
    int MIN_LENGTH = 100;
    int MIN_WIDTH = 1;
    int MIN_HEIGHT = 1;

    public void displayDescription();

    public void displayDensity();
}
