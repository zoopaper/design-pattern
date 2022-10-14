package com.pattern.factory.demo1;

import com.pattern.factory.demo1.Chart;

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
