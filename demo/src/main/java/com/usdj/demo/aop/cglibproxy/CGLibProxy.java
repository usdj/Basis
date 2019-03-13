package com.usdj.demo.aop.cglibproxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @program: demo
 * @description:
 * @author: JerryDeng
 * @create: 2019-03-13 20:59
 **/
public class CGLibProxy implements MethodInterceptor {

	private static CGLibProxy instance = new CGLibProxy();

	public CGLibProxy() {
	}

	public static CGLibProxy getInstance() {
		return instance;
	}

	public <T> T getProxy(Class<T> tClass) {
		return (T) Enhancer.create(tClass, this);
	}

	@Override
	public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
		before();
		Object result = methodProxy.invokeSuper(o, objects);
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
