package com.pattern.singleton;

/**
 * 双重检查单例，在在第二次检查中加上 synchronized代码块。以缩小同步锁的访问。
 * <p/>
 * User : krisibm@163.com
 * Date: 2015/9/7
 * Time: 9:29
 */
public class LazyLoadDoubleCheckSingleton {

    private static volatile LazyLoadDoubleCheckSingleton instance = null;

    private LazyLoadDoubleCheckSingleton() {
    }

    public static LazyLoadDoubleCheckSingleton getInstance() {
        //第一次检查
        if (instance == null) {
            synchronized (LazyLoadDoubleCheckSingleton.class) {
                //第二次检查
                if (instance == null) {
                    instance = new LazyLoadDoubleCheckSingleton();
                }
            }
        }
        return instance;
    }

}
