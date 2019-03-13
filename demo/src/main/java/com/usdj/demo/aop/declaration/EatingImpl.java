package com.usdj.demo.aop.declaration;

import org.springframework.stereotype.Component;

/**
 * @program: demo
 * @description:
 * @author: JerryDeng
 * @create: 2019-03-13 21:53
 **/
@Component
public class EatingImpl implements Eating {
	@Override
	public void eat(String food) {
		System.out.println("Having " + food);
	}
}
