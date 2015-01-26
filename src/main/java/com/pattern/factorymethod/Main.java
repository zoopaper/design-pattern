package com.pattern.factorymethod;

/**
 * @author kris
 * 
 */
public class Main {

	public static void main(String[] args) {
		ChartFactory cf = new MediaChart();

		Chart chart = cf.create(1);
		chart.generate();

		chart = cf.create(3);
		chart.generate();
	}

}
