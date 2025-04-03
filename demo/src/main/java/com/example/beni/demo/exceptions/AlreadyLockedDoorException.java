package com.example.beni.demo.exceptions;

public class AlreadyLockedDoorException extends Exception {
    public AlreadyLockedDoorException(String message) {
        super(message);
    }
}
