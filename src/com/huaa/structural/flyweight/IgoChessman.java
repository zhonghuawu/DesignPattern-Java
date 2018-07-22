package com.huaa.structural.flyweight;

public abstract class IgoChessman {
    public abstract String getColor();

    public void display(Coordinates coordinates) {
        System.out.println("igo chessman color: " + getColor() + ", position: " + coordinates.toString());
    }
}
