package com.usdj.demo.arithmetic.basic;

/**
 * @program: demo
 * @description:计算h米落下，每次弹高h/2后落下经过n次多地，总共多高
 * @author: JerryDeng
 * @create: 2019-03-13 14:13
 **/
public class Route {
	public static void route(double h, int n){
		double s = 0;
		for (int i = 1; i <= n; i++) {
			s += h;
			h = h/2;
			s += h;
		}
		System.out.println(n + "次反弹总路程" + s);
	}
}
