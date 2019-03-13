package com.usdj.demo.aop.introductionadvice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: demo
 * @description:
 * @author: JerryDeng
 * @create: 2019-03-13 22:52
 **/
public class Application {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("introadvice/spring.xml");
		EatingImpl eating = (EatingImpl) context.getBean("eatingProxy");
		eating.eat("backey");
		Drinking drinking = (Drinking) eating;
		drinking.drink("milk");
	}
}
