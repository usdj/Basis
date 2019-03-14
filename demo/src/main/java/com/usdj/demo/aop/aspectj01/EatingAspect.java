package com.usdj.demo.aop.aspectj01;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @program: demo
 * @description:
 * @author: JerryDeng
 * @create: 2019-03-14 17:41
 **/
@Aspect
@Component
public class EatingAspect {

	@Around("execution(* com.usdj.demo.aop.aspectj01.EatingImpl.*(..))")
	public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		before();
		Object result = proceedingJoinPoint.proceed();
		after();
		return result;
	}

	public void before() {
		System.out.println("before");
	}

	public void after() {
		System.out.println("after");
	}
}
