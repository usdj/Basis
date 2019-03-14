package com.usdj.demo.aop.aspectj02;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @program: demo
 * @description:
 * @author: JerryDeng
 * @create: 2019-03-14 18:17
 **/
@Aspect
@Component
public class EatingAspect {
	@Around("@annotation(com.usdj.demo.aop.aspectj02.Tag)")
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
