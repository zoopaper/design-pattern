package com.pattern.observer.push;

/**
 * User: shijingui
 * Date: 2016/7/16
 */
public class PersonObserver implements Observer {
    @Override
    public void update(String json) {
        System.out.println("个人订阅：" + json);
    }
}
