package com.pattern.chainresponsibility;

/**
 * User:krisjin
 * Date:2020-05-05
 */
public class Concrete2Handler extends Handler {

    private static final String a = "a";

    @Override
    public void handelRequest(RequestType requestType) {
        if (requestType.name().equals("aa")) {
            System.err.println("making22");
        } else {
            successor.handelRequest(requestType);
        }
    }
}
