package com.pattern.observer.weather;

/**
 * User: krisjin
 * Date: 2016/7/16
 */
public interface Subject {
    public void registerObserver(Observer observer);

    public void removeObserver(Observer observer);

    public void notifyObservers();

}
