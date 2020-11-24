package com.pattern;

import org.junit.Test;

/**
 * 要优先使用基本类型而不是装箱基本类型，要当心无意识的自动装箱。
 * User: krisjin
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
