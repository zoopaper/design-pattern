package com.pattern.factorymethod;

/**
 * 新闻数量趋势图
 *
 * @author krisjin
 */
public class NewsQuantityTrendsChart implements Chart {


    @Override
    public void generate() {
        System.out.println("新闻数量趋势图...");
    }

}
