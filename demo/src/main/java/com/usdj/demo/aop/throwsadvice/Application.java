package com.usdj.demo.aop.throwsadvice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: demo
 * @description:
 * @author: JerryDeng
 * @create: 2019-03-13 22:26
 **/
public class Application {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("throwsadvice/spring.xml");
		Eating eating = (Eating) context.getBean("eatingProxy");
		eating.eat("steak");
	}
}
