package com.pattern.singleton;

/**
 * @date 2021-12-16 19:42
 * @author krisjin
 */
public enum SingletonEnum {
    INSTANCE;

    private SingletonEnum() {
    }

    public SingletonEnum SingletonEnum() {

        return INSTANCE;
    }
}
