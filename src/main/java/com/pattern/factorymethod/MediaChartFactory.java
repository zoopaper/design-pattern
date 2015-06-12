package com.pattern.factorymethod;

/**
 * 媒体舆情图工厂
 *
 * @author krisjin
 */
public class MediaChartFactory {


    public static <T extends IChart> T create(Class<T> clazz) {
        IChart chart = null;
        try {
            chart = (IChart) Class.forName(clazz.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return (T) chart;
    }
}
