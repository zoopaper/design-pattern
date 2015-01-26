package com.pattern.factorymethod;

/**
 * @author kris
 * 
 */
public interface ChartFactory {
	public Chart create(int type);
}
