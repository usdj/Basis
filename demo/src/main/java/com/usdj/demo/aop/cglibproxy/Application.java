package com.usdj.demo.aop.cglibproxy;

/**
 * @program: demo
 * @description:
 * @author: JerryDeng
 * @create: 2019-03-13 21:04
 **/
public class Application {
	public static void main(String[] args) {
	    Eating eating = CGLibProxy.getInstance().getProxy(EatingImpl.class);
	    eating.eat("cherry");
	}
}
