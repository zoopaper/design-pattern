package com.pattern.proxy.jdk;

import java.lang.reflect.Proxy;

public class UserTest {

	public static void main(String[] args) {

		AirProduct europe = new EuropeAirPurifier();

		NorthProxy proxy = new NorthProxy(europe);

		AirProduct ap = (AirProduct) Proxy.newProxyInstance(europe.getClass().getClassLoader(), europe.getClass().getInterfaces(), proxy);

		String ret = ap.sell();
		
		System.out.println(ret);
	}
}
