package com.huaa.creation.simpleFactory;

public class LineChart implements Chart {
    public LineChart() {
        System.out.println("create LineChart");
    }

    @Override
    public void display() {
        System.out.println("display LineChart");
    }
}
