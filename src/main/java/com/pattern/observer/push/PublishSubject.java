package com.pattern.observer.push;

/**
 * 发布主题
 * @author krisjin
 * @date 2015-1-30
 */
public class PublishSubject extends Subject {

	public void send(String json) {
		
		System.out.println("主题发布消息:羊年大吉!");
		
		this.notifyObserver(json);
	}

}
