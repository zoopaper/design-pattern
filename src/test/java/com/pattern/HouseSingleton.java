package com.pattern;

public class HouseSingleton {

    private HouseSingleton() {
    }

    private static final HouseSingleton INSTANCE = new HouseSingleton();

    public static HouseSingleton getInstance() {
        return INSTANCE;
    }

}
