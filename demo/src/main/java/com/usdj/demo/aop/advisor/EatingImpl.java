package com.usdj.demo.aop.advisor;

import org.springframework.stereotype.Component;

/**
 * @program: demo
 * @description:
 * @author: JerryDeng
 * @create: 2019-03-14 15:43
 **/
@Component
public class EatingImpl implements Eating {
	@Override
	public void eat(String food) {
		System.out.println("Having " + food);
	}

	public void washPlate() {
		System.out.println("Finish washing plate!");
	}

	public void washToilet() {
		System.out.println("Finish washing toilet");
	}
}
