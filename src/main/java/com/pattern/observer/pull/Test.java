package com.pattern.observer.pull;

/**
 * @author krisjin
 * @date 2015-1-30
 */
public class Test { 
	public static void main(String[] args) {
		SubjectImpl subject = new SubjectImpl();

		Observer observer = new ConfigObserver(1);
		Observer observer2 = new ConfigObserver(2);

		subject.register(observer);
		subject.register(observer2);

		subject.change("success !");

	}

}
