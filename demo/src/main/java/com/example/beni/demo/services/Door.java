package com.example.beni.demo.services;

import com.example.beni.demo.exceptions.AlreadyLockedDoorException;

public class Door extends Bloc {

    private boolean openable;
    private String name;

    public Door(final int length, final int width, final int height, final String name, boolean openable) {
        super(length, width, height); // mama constructor
        this.name = name;
        this.openable = openable;
    }

    public void displayBloc() {
        System.out.println(
                super.length + " " +
                        super.width + " " +
                        super.height + " " +
                        this.name + " " +
                        this.openable);
    }

    // override
    @Override
    public void displayDescription() {
        System.out.println("I am a door named: " + name);
        this.displayBloc();

    }

    // overload
    public void displayDescription(final String description) {
        System.out.println(description);
    }

    public void displayDensity() {
        System.out.println("My density is 3");

    }

    // GETTERS
    public String getName() {
        return this.name;
    }

    public String verboseGetName() {
        return ("My name is : " + this.name);
    }

    // SETTERS
    public void setOpenable(boolean openable) {
        this.openable = openable;
    }

    public void setName(String name) {
        this.name = name;
    }

    // DISPLAY
    public String displayOpenable() {
        if (!this.openable)
            return (" is not openable.");
        else
            return (" is openable.");
    }

    public String displayTexture() {
        return (" wood.");
    }

    public void texture() {
        System.out.println("Texture: wood");
    }
    
    // BOOLEANS
    public boolean isOpenable() {
        return openable;
    }

	public void lock() throws AlreadyLockedDoorException {
		if (!isOpenable()) {
			throw new AlreadyLockedDoorException("Door is already lock!");
		} else {
			openable = false;
        }
    }
}