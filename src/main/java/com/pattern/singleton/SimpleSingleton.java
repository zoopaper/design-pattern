package com.pattern.singleton;

/**
 * 线程安全，对于static属性的初始化只能由一个线程执行且仅一次
 * User: shijingui
 * Date: 2016/9/19
 */
public class SimpleSingleton {
    private static SimpleSingleton instance = new SimpleSingleton();

    private SimpleSingleton() {
    }

    public static SimpleSingleton getInstance() {
        return instance;
    }
}
