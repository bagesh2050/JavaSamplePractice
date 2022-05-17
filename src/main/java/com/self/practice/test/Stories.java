package com.self.practice.test;

public class Stories {
	public static int numberOfArrangements(int numberOfStories) {

		int div = numberOfStories / 2;

		long count = 0;

		for (int i = 0; i <= div; i++) {
			count = count + fact(numberOfStories - i) / (fact(i) * fact(numberOfStories - 2 * i));
		}

		return (int) count;
	}

	public static void main(String[] args) {
		System.out.println(numberOfArrangements(6));
	}

	public static long fact(int n) {
		long fact = 1;
		for (int i = 2; i <= n; i++) {
			fact = fact * i;
		}
		return fact;
	}
}