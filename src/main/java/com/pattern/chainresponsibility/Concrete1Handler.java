package com.pattern.chainresponsibility;

/**
 * User:krisjin
 * Date:2020-05-05
 */
public class Concrete1Handler extends Handler {

    private static final String a = "a";

    @Override
    public void handelRequest(RequestType requestType) {
        if (requestType.name().equals("INIT")) {
            System.err.println("making");
        } else {
            successor.handelRequest(requestType);
        }
    }
}
