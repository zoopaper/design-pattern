package com.pattern.observer.pull;

/**
 * @author krisjin
 * @date 2015-1-30
 */
public class ConfigObserver implements Observer {

	private String state;
	private long id;

	public ConfigObserver(long id) {
		this.id = id;
	}

	public void update(Subject subject) {
		if (subject instanceof SubjectImpl) {
			SubjectImpl subObj = (SubjectImpl) subject;

			state = subObj.getState();
			System.out.println("观察者" + id + "更新状态：" + state);
		}

	}

}
