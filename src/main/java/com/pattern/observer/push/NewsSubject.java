package com.pattern.observer.push;

/**
 * 新闻主题
 *
 * @author krisjin
 * @date 2015-1-30
 */
public class NewsSubject extends Subject {

    public void notify(String json) {
        for (Observer observer : observerList) {
            observer.update(json);
        }
    }

}
