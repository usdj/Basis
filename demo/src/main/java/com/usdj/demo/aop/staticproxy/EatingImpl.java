package com.usdj.demo.aop.staticproxy;

/**
 * @program: demo
 * @description:
 * @author: JerryDeng
 * @create: 2019-03-13 19:01
 **/
public class EatingImpl implements Eating {
	@Override
	public void eat(String food) {
		System.out.println("Having:" + food);
	}
}
