package com.pattern.factorymethod;


/**
 * @author kris
 */
public class Main {

    public static void main(String[] args) {


        IChart newsQuantityTrendsChart = MediaChartFactory.create(NewsQuantityTrendsChart.class);
        newsQuantityTrendsChart.generate();

    }

}
