package com.huaa.creation.simpleFactory;

public class HistogramChart implements Chart {
    public HistogramChart() {
        System.out.println("create histogram");
    }

    @Override
    public void display() {
        System.out.println("display histogram");
    }
}
