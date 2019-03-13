package com.usdj.demo.arithmetic.basic;

/**
 * @program: demo
 * @description: 求完数，完数就是这个数等于其因子之和,求n以内的完数
 * @author: JerryDeng
 * @create: 2019-03-13 14:06
 **/
public class Perfect {

	public static void perfect01(int n) {
		int s;
		for (int i = 1; i<=n; i++ ){
			s = 0;
			for (int j = 1; j< i; j++) {
				if (i %j == 0) {
					s = s + j;
				}
			}
			if (s == i) {
				System.out.println(i);
			}
		}
	}
}
