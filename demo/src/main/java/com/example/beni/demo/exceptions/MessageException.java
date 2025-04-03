package com.example.beni.demo.exceptions;

public enum MessageException {

    LENGTH_SIZE("Error: Length toos small."),
    WIDTH_SIZE("Error: Width toos small."),
    HEIGHT_SIZE("Error: Height toos small.");

    private final String msg;

    MessageException(String msg) {
        this.msg = msg;
    }

    public String getMessage() {
        return msg;
    }
}