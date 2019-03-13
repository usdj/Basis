package com.usdj.demo.aop.throwsadvice;

import org.springframework.aop.ThrowsAdvice;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @program: demo
 * @description:
 * @author: JerryDeng
 * @create: 2019-03-13 22:24
 **/
@Component
public class ThrowAdvice implements ThrowsAdvice {
	public void afterThrowing(Method method, Object[] args, Object target, Exception e) {
		System.out.println("---------- Throw Exception ----------");
		System.out.println("Target Class: " + target.getClass().getName());
		System.out.println("Method Name: " + method.getName());
		System.out.println("Exception Message: " + e.getMessage());
		System.out.println("-------------------------------------");
	}
}
