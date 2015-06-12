package com.pattern.factorymethod;


/**
 * @author kris
 */
public class Main {

    public static void main(String[] args) {

        AbstractChartFactory cf = new MediaChartFactory();

        IChart newsQuantityTrendsChart = cf.create(NewsQuantityTrendsChart.class);
        newsQuantityTrendsChart.generate();

    }

}
