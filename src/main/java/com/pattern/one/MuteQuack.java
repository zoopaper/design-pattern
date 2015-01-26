package com.pattern.one;

/**
 * Created by krisjin on 14-8-24.
 */
public class MuteQuack implements QuackBehavior {

	public void quack() {
		System.out.println("<< Silence >>");
	}
}
