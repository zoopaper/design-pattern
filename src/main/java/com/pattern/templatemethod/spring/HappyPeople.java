package com.pattern.templatemethod.spring;

/**
 * User: krisjin
 * Date: 2016/9/19
 */
public abstract class HappyPeople {

    public void celebrateSpringFestival() {
        subscribeTicket();
        travel();
        celebrate();
    }

    protected abstract void travel();

    protected final void subscribeTicket() {
        System.out.println("订票...");
    }

    protected final void celebrate() {
        System.out.println("合家团圆庆祝...");
    }
}
