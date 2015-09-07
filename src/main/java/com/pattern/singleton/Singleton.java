package com.pattern.singleton;

/**
 * 内部类创建实例
 * <p/>
 * User : krisibm@163.com
 * Date: 2015/9/7
 * Time: 9:05
 */
public class Singleton {

    private Singleton() {
    }


    public static Singleton getInstance() {
        return SingletonHolder.singleton;
    }

    public static class SingletonHolder {
        private final static Singleton singleton = new Singleton();
    }
}
