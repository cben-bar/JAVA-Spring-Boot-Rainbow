package com.example.beni.demo.services;

public abstract class Bloc implements IBloc {

    protected int length;
    protected int width;
    protected int height;

    public Bloc(final int length, final int width, final int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public void displayDescription() {
        System.out.println("I am a bloc!");
    }

    public abstract void texture();
}
