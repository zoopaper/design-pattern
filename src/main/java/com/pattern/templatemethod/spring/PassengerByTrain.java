package com.pattern.templatemethod.spring;

/**
 * User: krisjin
 * Date: 2016/9/19
 */
public class PassengerByTrain extends HappyPeople {
    @Override
    protected void travel() {
        System.out.println("坐火车回家...");
    }
}
