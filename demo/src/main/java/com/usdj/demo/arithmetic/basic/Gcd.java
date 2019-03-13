package com.usdj.demo.arithmetic.basic;

/**
 * @program: demo
 * @description: 求最大公约数
 * @author: JerryDeng
 * @create: 2019-03-13 12:24
 **/
public class Gcd {

	/**
	 * 性质1 如果a>b，则a和b与a-b和b的最大公约数相同，即Gcd(a, b) = Gcd(a-b, b)
	 * 性质2 如果b>a，则a和b与a和b-a的最大公约数相同，即Gcd(a, b) = Gcd(a, b-a)
	 * 性质3 如果a=b，则a和b的最大公约数与a值和b值相同，即Gcd(a, b) = a = b
	 * 递归相减法
	 * @param x
	 * @param y
	 * @return
	 */
	public static int gcd01(int x, int y) {
		if (x<=0 || y<=0) {
			return -1;
		} else if (x > y) {
			return gcd01(x-y, y);
		} else if (x < y) {
			return gcd01(x, y-x);
		} else {
			return x;
		}
	}

	/**
	 * 辗转相除法
	 * @param x
	 * @param y
	 * @return
	 */
	public static int gcd02(int x, int y) {
		if (x < y) {
			x ^= y;
			y ^= x;
			x ^= y;
		}
		while (y!=0) {
			if (x == y) {
				return x;
			} else {
				int k = x % y;
				x = y;
				y = k;
			}
		}
		return x;
	}
}
