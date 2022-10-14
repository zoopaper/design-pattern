package com.pattern;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * User: krisjin
 * Date: 2016/4/30
 */
public class HouseSingletonMain {

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

    @Test
    public void dd(){
        List l= new ArrayList<>();
        l.add("11");
        l.add("12");
        System.err.println(l);
    }
}
