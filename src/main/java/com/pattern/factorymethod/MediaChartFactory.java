package com.pattern.factorymethod;

/**
 * 媒体舆情图工厂
 *
 * @author krisjin
 */
public class MediaChartFactory implements ChartFactory {


    @Override
    public Chart createChart(ChartEnum chartEnum) {
        Chart chart = null;
        switch (chartEnum) {
            case NewsQuantityTrendsChart:
                chart = new NewsQuantityTrendsChart();
                break;
            case PositiveNegativeChart:
                chart = new PositiveNegativeChart();
                break;
        }
        return chart;
    }
}
