package com.pattern.factorymethod;

/**
 * User: shijingui
 * Date: 2016/9/20
 */
public interface ChartFactory {

    public Chart createChart(ChartEnum chartEnum);
}
