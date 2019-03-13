package com.usdj.demo.aop.declaration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: demo
 * @description:
 * @author: JerryDeng
 * @create: 2019-03-13 22:04
 **/
public class Application01 {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("declaration/application01.xml");
		Eating eating = (Eating) context.getBean("eatingProxy");
		eating.eat("banana");
	}
}
