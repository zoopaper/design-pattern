package com.pattern.observer.pull;

import java.util.ArrayList;
import java.util.List;

/**
 * @author krisjin
 * @date 2015-1-30
 */
public abstract class Subject {

	private List<Observer> observerList = new ArrayList<Observer>();

	public void register(Observer osbserver) {

		observerList.add(osbserver);

	}

	public void remove(Observer observer) {
		observerList.remove(observer);
	}

	public void notifyObserver() {
		for (Observer observer : observerList) {
			observer.update(this);
		}

	}
}
