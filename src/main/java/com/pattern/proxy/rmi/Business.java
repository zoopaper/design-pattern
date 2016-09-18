package com.pattern.proxy.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * User: shijingui
 * Date: 2016/9/17
 */
public interface Business extends Remote {
    public String echo(String message) throws RemoteException;
}
