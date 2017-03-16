package com.pattern.observer.pull;

/**
 * @author krisjin
 * @date 2015-1-30
 */
public class Test { 
	public static void main(String[] args) {
		ConcreteSubject subject = new ConcreteSubject();

		IObserver observer = new ConcreteObserver(1);
		IObserver observer2 = new ConcreteObserver(2);

		subject.register(observer);
		subject.register(observer2);

		subject.change("success !");

	}

}
