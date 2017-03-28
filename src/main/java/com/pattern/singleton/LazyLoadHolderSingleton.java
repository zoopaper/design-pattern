package com.pattern.singleton;

/**
 * 内部类创建实例，维护实例.
 * 使用内部类的方式维护实例，既保证类懒加载的方式，还不用使用synchronized关键字，是一种比较完善的方式。
 * <p/>
 * User : krisibm@163.com
 * Date: 2015/9/7
 * Time: 9:05
 */
public class LazyLoadHolderSingleton {

    private LazyLoadHolderSingleton() {
    }

    //当调用getInstance才会初始化实例
    public static LazyLoadHolderSingleton getInstance() {
        return SingletonHolder.instance;
    }

    //内部类，当加载LazyLoadHolderSingleton类时，该内部类不会被实例化
    public static class SingletonHolder {
        private final static LazyLoadHolderSingleton instance = new LazyLoadHolderSingleton();
    }
}
