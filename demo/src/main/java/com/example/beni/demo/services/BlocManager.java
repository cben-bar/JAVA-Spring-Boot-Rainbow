package com.example.beni.demo.services;

import java.util.LinkedList;

public class BlocManager {
    private LinkedList<Bloc> blocList = new LinkedList<>();

    public void addBloc(Bloc bloc) {
        blocList.add(bloc);
    }

    public void addDoor(int length, int width, int height, String name, boolean openable) {
        Door door = new Door(length, width, height, name, openable);
        addBloc(door);
    }

    public void addWall(int length, int width, int height, String name, boolean loadBearing) {
        Wall wall = new Wall(length, width, height, name, loadBearing);
        addBloc(wall);
    }

    // GETTERS
    public Bloc getBlocById(String id) {
        for (Bloc bloc : blocList) {
            if (bloc.getId().equals(id)) {
                return bloc;
            }
        }
        return null;
    }

    public Bloc getBlocByName(String nameToFind) {
        for (Bloc bloc : blocList) {
            if (bloc instanceof Wall && ((Wall) bloc).getName().equals(nameToFind)) {
                return bloc;
            }
            if (bloc instanceof Door && ((Door) bloc).getName().equals(nameToFind)) {
                return bloc;
            }
        }
        return null;
    }

    public String getIdByBloc(Bloc bloc) {
        if (bloc != null) {
            return bloc.getId();
        }
        return null;
    }

    public int getSize() {
        return blocList.size();
    }

    // SETTERS
    public void changeBlocName(String id, String newName) {
        Bloc bloc = getBlocById(id);
        if (bloc instanceof Door) {
            ((Door) bloc).setName(newName);
        } else if (bloc instanceof Wall) {
            ((Wall) bloc).setName(newName);
        }
    }

    // DISPLAY

    public void displayAllBlocs() {
        for (Bloc bloc : blocList) {
            System.out.println(
                    "ID: " + bloc.getId() + " | Type: " + bloc.getClass().getSimpleName() + " | "
                            + getClass().getSimpleName());
        }
    }

    public void displayInt(int num) {
        System.out.println(num);
    }
}
