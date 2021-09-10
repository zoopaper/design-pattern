package com.pattern.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class NorthProxy implements InvocationHandler {

    private Object target;

    public NorthProxy(Object target) {
        this.target = target;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String result;
        System.out.println("开始代理获取商品并重新定价");

        result = (String) method.invoke(target, args);

        System.out.println("结束代理获取商品并重新定价");

        return result;
    }

}
