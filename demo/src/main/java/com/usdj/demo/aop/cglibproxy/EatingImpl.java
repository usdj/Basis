package com.usdj.demo.aop.cglibproxy;

/**
 * @program: demo
 * @description:
 * @author: JerryDeng
 * @create: 2019-03-13 20:59
 **/
public class EatingImpl implements Eating {
	@Override
	public void eat(String food) {
		System.out.println("Having " + food);
	}
}
