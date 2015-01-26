package com.pattern.one;

/**
 * Created by krisjin on 14-8-24.
 */
public class MiniDuckSimulator {
	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.performFly();
		mallard.performQuack();
		mallard.display();
	}
}
