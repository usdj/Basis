package com.usdj.demo.aop.jdkproxy;

/**
 * @program: demo
 * @description:
 * @author: JerryDeng
 * @create: 2019-03-13 20:42
 **/
public class EatingImpl implements Eating {
	@Override
	public void eat(String food) {
		System.out.println("Having " + food);
	}
}
