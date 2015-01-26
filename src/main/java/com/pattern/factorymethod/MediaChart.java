package com.pattern.factorymethod;

/**
 * @author kris
 * 
 */
public class MediaChart implements ChartFactory {

	public Chart create(int type) {
		Chart chart = null;
		switch (type) {
		case 1:
			chart = new PositiveNegativeChart();
			break;
		case 2:
			chart = new NewsQuantityTrendsChart();
		default:
			break;
		}

		return chart;
	}

}
