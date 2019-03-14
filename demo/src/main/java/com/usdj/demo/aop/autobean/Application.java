package com.usdj.demo.aop.autobean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: demo
 * @description:
 * @author: JerryDeng
 * @create: 2019-03-14 16:41
 **/
public class Application {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("autobean/spring.xml");
		Eating eating = (EatingImpl) context.getBean("eatingImpl");
		eating.eat("fish");
	}
}
