package com.pattern.chainresponsibility;

/**
 * User:krisjin
 * Date:2020-05-05
 */
public class Client {

    public static void main(String[] args) {


        Handler handler = new Concrete1Handler();
        handler.setSuccessor(new Concrete2Handler());
        handler.handelRequest(RequestType.INIT);

    }
}
