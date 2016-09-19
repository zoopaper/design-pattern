package com.pattern.templatemethod.spring;

/**
 * User: shijingui
 * Date: 2016/9/19
 */
public class PassengerByAir extends HappyPeople {
    @Override
    protected void travel() {
        System.out.println("坐飞机回家...");
    }
}
