package com.usdj.demo.aop.throwsadvice;

import org.springframework.stereotype.Component;

/**
 * @program: demo
 * @description:
 * @author: JerryDeng
 * @create: 2019-03-13 22:23
 **/
@Component
public class EatingImpl implements Eating {
	@Override
	public void eat(String food) {
		System.out.println("Having " + food);
		throw new RuntimeException("I'm Hungry,Error!");
	}
}
