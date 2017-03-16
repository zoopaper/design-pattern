package com.pattern.observer.pull;

import java.util.ArrayList;
import java.util.List;

/**
 * 定义一个抽象主题，被观察对象。
 * 包含增加删除观察者
 *
 * @author krisjin
 * @date 2015-1-30
 */
public abstract class Subject {

    private List<IObserver> observerList = new ArrayList<IObserver>();

    public void register(IObserver observer) {

        observerList.add(observer);

    }

    public void remove(IObserver observer) {
        observerList.remove(observer);
    }

    public void notifyObserver() {
        for (IObserver observer : observerList) {
            observer.update(this);
        }

    }
}
