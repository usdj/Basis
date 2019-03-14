package com.usdj.demo.aop.aspectj04;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @program: demo
 * @description:
 * @author: JerryDeng
 * @create: 2019-03-14 19:11
 **/

public class EatingAspect {

	public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		before();
		Object result = proceedingJoinPoint.proceed();
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
