package com.aop;

import java.lang.reflect.Proxy;

public class SimpleAOP {
	public static Object getProxy(Object bean, Advice advice) {
        return Proxy.newProxyInstance(SimpleAOP.class.getClassLoader(), 
                bean.getClass().getInterfaces(), advice);
    }
}
