package com.huaa.creation.simpleFactory;

public class PieChart implements Chart {
    public PieChart() {
        System.out.println("create PieChart");
    }

    @Override
    public void display() {
        System.out.println("display PieChart");
    }
}
