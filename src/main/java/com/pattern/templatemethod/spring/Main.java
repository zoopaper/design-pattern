package com.pattern.templatemethod.spring;

/**
 * User: krisjin
 * Date: 2016/9/19
 */
public class Main {
    public static void main(String[] args) {
        HappyPeople happyPeople = new PassengerByAir();
        HappyPeople happyPeople1 = new PassengerByTrain();
        happyPeople.celebrateSpringFestival();
        happyPeople1.celebrateSpringFestival();
    }
}
