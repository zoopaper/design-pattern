package com.pattern.one;

/**
 * Created by krisjin on 14-8-24.
 */
public class MallardDuck extends Duck {

	public MallardDuck() {

		flyBehavior = new FlyWithWings();
		quackBehavior = new Quack();
	}

	@Override
	public void display() {
		System.out.println(" I'm a real Mallard duck");
	}
}
