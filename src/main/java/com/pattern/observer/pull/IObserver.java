package com.pattern.observer.pull;

/**
 * 定义一个观察者接口，它有一个update的方法，当主题有变化时，会通过该方法通知观察者
 *
 * @author krisjin
 * @date 2015-1-30
 */
public interface IObserver {

    void update(Subject subject);

}
