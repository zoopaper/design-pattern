package com.pattern.templatemethod.spring;

/**
 * User: krisjin
 * Date: 2016/9/19
 */
public class PassengerByCoach extends HappyPeople {
    @Override
    protected void travel() {
        System.out.println("座长途汽车回家...");
    }
}
