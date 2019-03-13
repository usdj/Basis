package com.usdj.demo.aop.advice;

import org.springframework.aop.framework.ProxyFactory;

/**
 * @program: demo
 * @description: 环绕增强
 * @author: JerryDeng
 * @create: 2019-03-13 21:29
 **/
public class Application03 {
	public static void main(String[] args) {
		ProxyFactory proxyFactory = new ProxyFactory();
		proxyFactory.setTarget(new EatingImpl());
		proxyFactory.addAdvice(new AroundAdvice());
		Eating eating = (Eating) proxyFactory.getProxy();
		eating.eat("pear");
	}
}
