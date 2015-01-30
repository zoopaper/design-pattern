package com.pattern.observer.push;

import java.util.ArrayList;
import java.util.List;

/**
 * 主题抽象类(被观察者)
 * 
 * @author krisjin
 * @date 2015-1-30
 */
public abstract class Subject {

	private List<Observer> observerList = new ArrayList<Observer>();

	public void register(Observer observer) {
		observerList.add(observer);
	}

	public void remove(Observer observer) {
		observerList.remove(observer);
	}

	public void notifyObserver(String json) {

		for (Observer observer : observerList) {
			observer.receive(json);
		}

	}

}
