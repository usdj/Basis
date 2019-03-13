package com.usdj.demo.aop.advice;

import org.springframework.aop.framework.ProxyFactory;

/**
 * @program: demo
 * @description: 同时包括前置和后置
 * @author: JerryDeng
 * @create: 2019-03-13 21:27
 **/
public class Application02 {
	public static void main(String[] args) {
		ProxyFactory proxyFactory = new ProxyFactory();
		proxyFactory.setTarget(new EatingImpl());
		proxyFactory.addAdvice(new BeforeAndAfterAdvice());
		Eating eating = (Eating) proxyFactory.getProxy();
		eating.eat("milk");
	}
}
