package com.usdj.demo.aop.jdkproxy;

/**
 * @program: demo
 * @description:
 * @author: JerryDeng
 * @create: 2019-03-13 20:49
 **/
public class Application {
	public static void main(String[] args) {
	    Eating eating = new JDKProxy(new EatingImpl()).getProxy();
	    eating.eat("meat");
	}
}
