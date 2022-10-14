package com.pattern.factory.demo1;


import com.pattern.factory.demo1.Chart;
import com.pattern.factory.demo1.ChartEnum;
import com.pattern.factory.demo1.ChartFactory;
import com.pattern.factory.demo1.MediaChartFactory;

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
