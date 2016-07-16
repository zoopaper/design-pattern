package com.pattern.observer.push;

public class CompanyObserver implements Observer {

    public void update(String json) {
        System.out.println("公司订阅:" + json);
    }

}
