package com.pattern.singleton;

/**
 * 双重检查单例，在在第二次检查中加上 synchronized代码块。以缩小同步锁的访问。
 * <p/>
 * User : krisibm@163.com
 * Date: 2015/9/7
 * Time: 9:29
 */
public class DoubleCheckSingleton {

    private static volatile DoubleCheckSingleton doubleCheckSingleton = null;

    private DoubleCheckSingleton() {
    }


    public DoubleCheckSingleton getInstance() {

        if (doubleCheckSingleton == null) {
            synchronized (DoubleCheckSingleton.class) {
                if (doubleCheckSingleton == null) {
                    doubleCheckSingleton = new DoubleCheckSingleton();
                }
            }
        }
        return doubleCheckSingleton;
    }

}
