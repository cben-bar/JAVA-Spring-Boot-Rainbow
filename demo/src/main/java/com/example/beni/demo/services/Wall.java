package com.example.beni.demo.services;

public class Wall extends Bloc {

    private boolean loadBearing;
    private String name;

    public Wall(final int length, final int width, final int height, final String name, boolean loadBearing) {
        super(length, width, height); // mama constructor
        this.name = name;
        this.loadBearing = loadBearing;
    }

    public void displayBloc() {
        System.out.println(
                super.length + " " +
                        super.width + " " +
                        super.height + " " +
                        this.name + " " +
                        this.loadBearing);
    }

    // override
    @Override
    public void displayDescription() {
        System.out.println("I am a wall!");
    }

    // overload
    public void displayDescription(final String description) {
        System.out.println(description);
    }

    // GETTERS
    public String getName() {
        return this.name;
    }

    // SETTERS
    public void setLoadBearing(boolean loadB) {
        this.loadBearing = loadB;
    }

    // DISPLAY
    public String displayLoadBearing() {
        if (!this.loadBearing)
            return (" is not load-bearing.");
        else
            return (" is load-bearing.");
    }

    public String displayTexture() {
        return (" stone.");
    }

    public void texture() {
        System.out.println("Texture: stone");
    }

    // BOOLEANS
    public boolean isLoadBearing() {
        return loadBearing;
    }

}