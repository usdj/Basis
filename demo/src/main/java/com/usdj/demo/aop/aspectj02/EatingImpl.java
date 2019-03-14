package com.usdj.demo.aop.aspectj02;

import org.springframework.stereotype.Component;

/**
 * @program: demo
 * @description:
 * @author: JerryDeng
 * @create: 2019-03-14 18:10
 **/
@Component
public class EatingImpl implements Eating {
	@Tag
	@Override
	public void eat(String food) {
		System.out.println("Having " + food);
	}
}
