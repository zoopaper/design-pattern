package com.pattern.factory.demo1;

/**
 * @User: krisjin
 * @Date: 2016/9/20
 */
public interface ChartFactory {

    Chart createChart(ChartEnum chartEnum);

}
