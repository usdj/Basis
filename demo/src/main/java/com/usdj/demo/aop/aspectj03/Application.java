package com.usdj.demo.aop.aspectj03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: demo
 * @description:
 * @author: JerryDeng
 * @create: 2019-03-14 19:01
 **/
public class Application {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("aspectj03/spring.xml");
		Eating eating = (Eating) context.getBean("eatingImpl");
		eating.eat("fish");
		Drinking drinking = (Drinking) eating;
		drinking.drink("milk");
	}
}
