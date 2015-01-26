package com.patten.proxy.cglib;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**
 * @author krisjin
 * @date 2015-1-26
 */
public class DaoFacadeProxy implements MethodInterceptor {

	private Object target;

	public Object getInstance(Object target) {
		
		this.target = target;

		Enhancer enhancer = new Enhancer();

		enhancer.setSuperclass(this.target.getClass());

		enhancer.setCallback(this);

		return enhancer.create();
	}

	public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {

		proxy.invokeSuper(obj, args);

		return null;
	}

}
