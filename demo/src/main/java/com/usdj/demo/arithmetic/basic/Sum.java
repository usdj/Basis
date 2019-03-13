package com.usdj.demo.arithmetic.basic;

/**
 * @program: demo
 * @description: 求项数和 eg: s = a + aa + aa + ...
 * @author: JerryDeng
 * @create: 2019-03-13 14:01
 **/
public class Sum {

	public static void sum(int a, int n) {
		int s = 0;
		int t = 0;
		for (int i = 1; i <= n; i++) {
			t += a;
			a = a*10;
			s += t;
		}
		System.out.println("Sum:" + s);
	}
}
