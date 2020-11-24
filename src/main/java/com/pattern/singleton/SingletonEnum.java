package com.pattern.singleton;

/**
 * User: krisjin
 * Date: 2016/4/30
 */
public enum SingletonEnum {
    INSTANCE;

    private SingletonEnum() {
    }

    public SingletonEnum SingletonEnum() {

        return INSTANCE;
    }
}
