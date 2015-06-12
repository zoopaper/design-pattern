package com.pattern.factorymethod;

/**
 * 抽象舆情图工厂
 *
 * @author kris
 */
public abstract class AbstractChartFactory {

    /**
     * @param clazz
     * @param <T>
     * @return
     */
    public abstract <T extends IChart> T create(Class<T> clazz);

}
