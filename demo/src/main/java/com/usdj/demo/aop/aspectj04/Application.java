package com.usdj.demo.aop.aspectj04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: demo
 * @description:
 * @author: JerryDeng
 * @create: 2019-03-14 19:15
 **/
public class Application {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("aspectj04/spring.xml");
		Eating eating = (Eating) context.getBean("eatingImpl");
		eating.eat("fish");
	}
}
