package com.usdj.demo.aop.advice;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * @program: demo
 * @description:
 * @author: JerryDeng
 * @create: 2019-03-13 21:17
 **/
public class AfterAdvice implements AfterReturningAdvice {
	@Override
	public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
		System.out.println("after");
	}
}
