package com.usdj.demo.aop.staticproxy;

/**
 * @program: demo
 * @description:
 * @author: JerryDeng
 * @create: 2019-03-13 19:01
 **/
public class EatingProxy implements Eating{

	private EatingImpl eatingImpl;

	public EatingProxy(EatingImpl eatingImpl) {
		this.eatingImpl = eatingImpl;
	}

	@Override
	public void eat(String food) {
		before();
		eatingImpl.eat(food);
		after();
	}

	private void before() {
		System.out.println("before");
	}

	private void after() {
		System.out.println("after");
	}
}
