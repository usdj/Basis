package com.usdj.demo.aop.autoadvisor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: demo
 * @description:
 * @author: JerryDeng
 * @create: 2019-03-14 17:12
 **/
public class Application {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("autoadvisor/spring.xml");
		EatingImpl eatingImpl = (EatingImpl) context.getBean("eatingImpl");
		eatingImpl.eat("fish");
		eatingImpl.washPlate();
		eatingImpl.washToilet();
	}
}
