package com.pattern;

import org.junit.Test;

/**
 * User: shijingui
 * Date: 2016/5/1
 */
public class AutoBoxingPerformanceTest {

    @Test
    public void test() {
        Long sum = 0L;
        long startTime = System.currentTimeMillis();
        for (long i = 0; i < Integer.MAX_VALUE; i++) {
            sum += 1;
        }
        long endTime = System.currentTimeMillis();

        System.out.println("cost execute time:" + (endTime - startTime) / 1000 + "s");

    }

    @Test
    public void test2() {
        long sum = 0L;
        long startTime = System.currentTimeMillis();
        for (long i = 0; i < Integer.MAX_VALUE; i++) {
            sum += 1;

        }
        long endTime = System.currentTimeMillis();

        System.out.println("cost execute time:" + (endTime - startTime) / 1000 + "s");

    }
}
