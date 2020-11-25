package com.pattern.adapter.base;

/**
 * @author krisjin
 * @date 2020/11/25
 */
public class Client {

    public static void main(String[] args) {
        Adaptee adaptee = new Adaptee();
        Target targetAdapter = new Adapter(adaptee);
        targetAdapter.pull();
    }
}
