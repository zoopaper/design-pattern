package com.pattern.proxy.jdk;

public class EuropeAirPurifier implements AirProduct {

    public String sell() {

        System.out.println("真实价格,,,,,");

        return "SUCCESS";
    }

}
