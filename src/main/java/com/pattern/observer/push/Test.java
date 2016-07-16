package com.pattern.observer.push;

public class Test {

    public static void main(String[] args) {

        Subject subject = new NewsSubject();
        Observer observer1 = new CompanyObserver();
        Observer observer2 = new PersonObserver();

        subject.register(observer1);
        subject.register(observer2);
        subject.notify("您订阅的报纸已经寄出!");

        subject.remove(observer1);
        subject.remove(observer2);
        subject.notify("您订阅的报纸已经寄出!");

    }

}
