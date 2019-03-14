package com.usdj.demo.aop.aspectj03;

/**
 * @program: demo
 * @description:
 * @author: JerryDeng
 * @create: 2019-03-14 18:58
 **/
public class DrinkingImpl implements Drinking {
	@Override
	public void drink(String liquid) {
		System.out.println("Drinking " + liquid);
	}
}
