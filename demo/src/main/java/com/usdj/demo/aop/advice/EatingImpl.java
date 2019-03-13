package com.usdj.demo.aop.advice;

/**
 * @program: demo
 * @description:
 * @author: JerryDeng
 * @create: 2019-03-13 21:15
 **/
public class EatingImpl implements Eating {
	@Override
	public void eat(String food) {
		System.out.println("Having " + food);
	}
}
