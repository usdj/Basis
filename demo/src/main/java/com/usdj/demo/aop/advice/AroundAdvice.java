package com.usdj.demo.aop.advice;

import org.aopalliance.intercept.Invocation;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * @program: demo
 * @description:
 * @author: JerryDeng
 * @create: 2019-03-13 21:23
 **/
public class AroundAdvice implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation methodInvocation) throws Throwable {
		before();
		Object result = methodInvocation.proceed();
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
