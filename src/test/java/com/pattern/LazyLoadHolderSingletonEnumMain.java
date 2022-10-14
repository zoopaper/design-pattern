package com.pattern;

import com.pattern.singleton.SingletonEnum;
import org.junit.Test;

/**
 * User: krisjin
 * Date: 2016/4/30
 */
public class LazyLoadHolderSingletonEnumMain {

    @Test
    public void test() {
        SingletonEnum book = SingletonEnum.INSTANCE;
        SingletonEnum book2 = SingletonEnum.INSTANCE;
        System.out.println(book.hashCode());
        System.out.println(book2.hashCode());
        if (book == book2) {
            System.out.println(true);

        }
    }
}
