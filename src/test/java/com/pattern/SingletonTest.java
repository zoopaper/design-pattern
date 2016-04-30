package com.pattern;

import com.pattern.singleton.DoubleCheckSingleton;

/**
 * -verbose:gc -Xms50M -Xmx50M
 * <p/>
 * User : krisibm@163.com
 * Date: 2015/9/28
 * Time: 14:12
 */
public class SingletonTest {

    public static void main(String[] args) {

        DoubleCheckSingleton.getInstance();
        while (true) {
            new Obj();
        }

    }
    static class Obj {
        private byte[] obj = new byte[3 * 1024 * 1024];
    }
}

