package com.huaa.creation.simpleFactory;

public class Client {
    public static void main(String[] args) {
        Chart chart = null;
        chart = ChartFactory.getChart("pie");
        chart.display();
    }
}
