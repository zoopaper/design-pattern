package com.pattern.observer.push;

public class ConfigSubObserver implements Observer {
	
	private long id;

	public ConfigSubObserver(long id) {
		this.id = id;
	}

	public void receive(String json) {
		System.out.println("观察者"+id+"接收消息:" + json);
	}

}
