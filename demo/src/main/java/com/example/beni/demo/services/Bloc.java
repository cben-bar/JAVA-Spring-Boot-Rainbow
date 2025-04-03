package com.example.beni.demo.services;

import java.util.UUID;

import com.example.beni.demo.exceptions.MessageException;

public abstract class Bloc implements IBloc {

    protected int length;
    protected int width;
    protected int height;
    protected String id;

    public Bloc(final int length, final int width, final int height) {
        if (length < MIN_LENGTH) {
            throw new IllegalArgumentException(MessageException.LENGTH_SIZE.getMessage());
        } else if (width < MIN_WIDTH) {
            throw new IllegalArgumentException(MessageException.WIDTH_SIZE.getMessage());
        } else if (height < MIN_HEIGHT) {
            throw new IllegalArgumentException(MessageException.HEIGHT_SIZE.getMessage());
        } else {
            this.length = length;
            this.width = width;
            this.height = height;
            this.id = UUID.randomUUID().toString();
        }
    }

    public String getId() {
        return id;
    }

    public void displayDescription() {
        System.out.println("I am a bloc!");
    }

    public abstract void texture();

    public abstract String getName();
}
