package com.pattern;

import org.junit.Test;

/**
 * User: krisjin
 * Date: 2016/4/30
 */
public class HouseSingetonTest {

    @Test
    public void test() {
        HouseSingleton houseSingleton = HouseSingleton.getInstance();
        HouseSingleton houseSingleton2 = HouseSingleton.getInstance();
        if (houseSingleton == houseSingleton2) {
            System.out.println(true);
            System.out.println(houseSingleton.hashCode());
            System.out.println(houseSingleton.hashCode());
        } else {
            System.out.print(false);
        }
    }
}
