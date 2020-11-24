package com.pattern.proxy.rmi;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

/**
 * User: krisjin
 * Date: 2016/9/17
 */
public class Server {
    public static void main(String[] args) {
        int port = 8888;
        String name = "BusinessDemo";
        Business business = new BusinessImpl();
        try {
            UnicastRemoteObject.exportObject(business, port);
            Registry registry = LocateRegistry.createRegistry(1099);
            registry.rebind(name, business);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
