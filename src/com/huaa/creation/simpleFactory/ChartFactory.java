package com.huaa.creation.simpleFactory;

public class ChartFactory {
    public static Chart getChart(String type)
    {
        Chart chart = null;
        if (type.equalsIgnoreCase("histogram"))
        {
            chart = new HistogramChart();
            System.out.println("init HistogramChart");
        }
        else if (type.equalsIgnoreCase("pie"))
        {
            chart = new PieChart();
            System.out.println("init PieChart");
        }
        else if (type.equalsIgnoreCase("line"))
        {
            chart = new LineChart();
            System.out.println("init LineChart");
        }
        return chart;
    }
}
