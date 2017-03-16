package com.pattern.observer.pull;

/**
 * @author krisjin
 * @date 2015-1-30
 */
public class ConcreteSubject extends Subject {
	private String state;

	public void change(String newState) {
		
		this.state=newState;
		this.notifyObserver();
		
		
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

}
