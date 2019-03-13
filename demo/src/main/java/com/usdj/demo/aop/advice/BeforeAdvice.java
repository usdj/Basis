package com.usdj.demo.aop.advice;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @program: demo
 * @description:
 * @author: JerryDeng
 * @create: 2019-03-13 21:16
 **/
public class BeforeAdvice implements MethodBeforeAdvice {
	@Override
	public void before(Method method, Object[] objects, Object o) throws Throwable {
		System.out.println("before");
	}
}
