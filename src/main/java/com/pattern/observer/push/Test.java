package com.pattern.observer.push;

public class Test {

	public static void main(String[] args) {

		Subject subject = new PublishSubject();

		Observer obs = new ConfigSubObserver(1);
		Observer obs2 = new ConfigSubObserver(2);

		subject.register(obs);
		subject.register(obs2);

		subject.notifyObserver("羊年大吉!");

	}

}
