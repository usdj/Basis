package com.usdj.demo.arithmetic.basic;

/**
 * @program: demo
 * @description: 统计字符串中数字字母空格的个数
 * @author: JerryDeng
 * @create: 2019-03-13 13:48
 **/
public class Count {

	int digital, character, black, other;

	public void count(char[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= '0' && arr[i] <= '9') {
				digital++;
			} else if ((arr[i] >= 'a' && arr[i] <= 'z')) {
				character++;
			} else if ((arr[i] >= 'A' && arr[i] <= 'Z')) {
				character++;
			} else {
				if (arr[i] == ' ') {
					black++;
				} else {
					other++;
				}
			}
		}
	}
}
