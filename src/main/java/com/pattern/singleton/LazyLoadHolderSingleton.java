package com.pattern.singleton;

/**
 * 内部类创建实例
 * <p/>
 * User : krisibm@163.com
 * Date: 2015/9/7
 * Time: 9:05
 */
public class LazyLoadHolderSingleton {

    private LazyLoadHolderSingleton() {
    }

    public static LazyLoadHolderSingleton getInstance() {
        return SingletonHolder.instance;
    }

    public static class SingletonHolder {
        private final static LazyLoadHolderSingleton instance = new LazyLoadHolderSingleton();
    }
}
