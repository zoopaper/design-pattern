package com.pattern.strategy.enums;

/**
 * <p/>
 * User : krisibm@163.com
 * Date: 2015/6/15
 * Time: 14:05
 */
public enum Calculator {


    ADD("+") {
        public int exec(int a, int b) {
            return a + b;
        }
    },
    SUB("-") {
        @Override
        public int exec(int a, int b) {
            return a - b;
        }
    };

    String value = "";

    private Calculator(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

    public abstract int exec(int a, int b);
}
