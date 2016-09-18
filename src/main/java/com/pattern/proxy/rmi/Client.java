package com.pattern.proxy.rmi;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * User: shijingui
 * Date: 2016/9/17
 */
public class Client {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost");
            String name = "BusinessDemo";
            Business business = (Business) registry.lookup(name);
            String str = business.echo("good!!");
            System.out.println(str);
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (NotBoundException e) {
            e.printStackTrace();
        }
    }

}
