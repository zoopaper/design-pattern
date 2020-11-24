package com.pattern.proxy.rmi;

import java.rmi.RemoteException;

/**
 * User: krisjin
 * Date: 2016/9/17
 */
public class BusinessImpl implements Business {
    @Override
    public String echo(String message) throws RemoteException {
        if (message.toString().equals("quit")) {
            System.out.println("Server will be shutdown!!");
            System.exit(0);
        }
        return "Server Response :" + message;
    }


}
