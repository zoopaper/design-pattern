package com.pattern.factorymethod;


/**
 * @author kris
 */
public class Main {

    public static void main(String[] args) {
        ChartFactory chartFactory = new MediaChartFactory();
        Chart chart = chartFactory.createChart(ChartEnum.NewsQuantityTrendsChart);
        chart.generate();
        chart = chartFactory.createChart(ChartEnum.PositiveNegativeChart);
        chart.generate();
    }

}
