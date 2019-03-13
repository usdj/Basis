package com.usdj.demo.aop.declaration;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @program: demo
 * @description:
 * @author: JerryDeng
 * @create: 2019-03-13 21:25
 **/
@Component
public class BeforeAndAfterAdvice implements MethodBeforeAdvice, AfterReturningAdvice {
	@Override
	public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
		System.out.println("after");
	}

	@Override
	public void before(Method method, Object[] objects, Object o) throws Throwable {
		System.out.println("before");
	}
}
