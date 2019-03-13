package com.usdj.demo.aop.staticproxy;

/**
 * @program: demo
 * @description:
 * @author: JerryDeng
 * @create: 2019-03-13 19:03
 **/
public class Application {
	public static void main(String[] args) {
	    Eating eating = new EatingProxy(new EatingImpl());
	    eating.eat("apple");
	}
}
