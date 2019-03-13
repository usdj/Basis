package com.usdj.demo.aop.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @program: demo
 * @description:
 * @author: JerryDeng
 * @create: 2019-03-13 20:43
 **/
public class JDKProxy implements InvocationHandler {

	private Object target;

	public JDKProxy(Object target) {
		this.target = target;
	}

	public <T> T getProxy() {
		return (T) Proxy.newProxyInstance(
				target.getClass().getClassLoader(),
				target.getClass().getInterfaces(),
				this);
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		before();
		Object result = method.invoke(target, args);
		after();
		return result;
	}

	private void before() {
		System.out.println("before");
	}

	private void after() {
		System.out.println("after");
	}
}
