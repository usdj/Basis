package com.usdj.demo.aop.advisor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: demo
 * @description:
 * @author: JerryDeng
 * @create: 2019-03-14 15:49
 **/
public class Application {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("advisor/spring.xml");
		EatingImpl eatingImpl = (EatingImpl) context.getBean("eatingProxy");
		eatingImpl.eat("fish");
		eatingImpl.washPlate();
		eatingImpl.washToilet();
	}
}
