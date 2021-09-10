package com.pattern.proxy.jdk.mybatis;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author krisjin
 * @date 2015-2-6
 */
public class MapperProxy implements InvocationHandler {

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        return "hello news";
    }

}
