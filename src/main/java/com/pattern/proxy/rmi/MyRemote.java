package com.pattern.proxy.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * User: shijingui
 * Date: 2016/9/17
 */
public interface MyRemote extends Remote {
    public String sayHello() throws RemoteException;
}
