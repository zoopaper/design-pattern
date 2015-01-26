package com.pattern.one;

/**
 * Created by krisjin on 14-8-24.
 */
public class FlyNoWay implements FlyBehavior {
	@Override
	public void fly() {
		System.out.println("I can't fly");
	}
}
