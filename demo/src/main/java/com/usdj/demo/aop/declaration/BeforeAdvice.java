package com.usdj.demo.aop.declaration;

import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @program: demo
 * @description:
 * @author: JerryDeng
 * @create: 2019-03-13 21:16
 **/
@Component
public class BeforeAdvice implements MethodBeforeAdvice {
	@Override
	public void before(Method method, Object[] objects, Object o) throws Throwable {
		System.out.println("before");
	}
}
