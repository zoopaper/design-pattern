package com.pattern.proxy.rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 * User: shijingui
 * Date: 2016/9/17
 */
public class MyRemoteClient {

    public static void main(String[] args) {
        new MyRemoteClient().go();
    }

    public void go() {
        try {
            MyRemote myRemote = (MyRemote) Naming.lookup("rmi://127.0.0.1/RemoteHello");
            String s = myRemote.sayHello();
            System.out.println(s);
        } catch (NotBoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
