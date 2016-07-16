package com.pattern.observer.weather;

/**
 * 观察者接口
 * User: shijingui
 * Date: 2016/7/16
 */
public interface Observer {

    public void update(float temp, float humidity, float pressure);
}
