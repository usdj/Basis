package com.usdj.demo.aop.advice;

import org.springframework.aop.framework.ProxyFactory;

/**
 * @program: demo
 * @description: 前置加后置增强
 * @author: JerryDeng
 * @create: 2019-03-13 21:21
 **/
public class Application01 {
	public static void main(String[] args) {
		ProxyFactory proxyFactory = new ProxyFactory();
		proxyFactory.setTarget(new EatingImpl());
		proxyFactory.addAdvice(new BeforeAdvice());
		proxyFactory.addAdvice(new AfterAdvice());
		Eating eating = (Eating) proxyFactory.getProxy();
		eating.eat("bone");
	}
}
