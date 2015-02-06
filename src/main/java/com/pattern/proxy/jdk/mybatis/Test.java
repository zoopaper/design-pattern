package com.pattern.proxy.jdk.mybatis;

import java.lang.reflect.Proxy;

public class Test {

	public static void main(String[] args) {

		NewsMapper mapper = (NewsMapper) Proxy.newProxyInstance(NewsMapper.class.getClassLoader(),
				new Class[] { NewsMapper.class }, new MapperProxy());

		String s = mapper.getNews(22);
		System.out.println(s);
	}
}
