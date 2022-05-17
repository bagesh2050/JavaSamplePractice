package com.self.practice.pallindrome;

public class Test3 {

	public static void main(String[] args) {

		int num = 4221;

		if (isPallindrome(num)) {
			System.out.println(num + " is a Pallindrome.");
		} else {
			System.out.println(num + " is not a Pallindrome.");
		}
	}

	static boolean isPallindrome(int num) {

		int newNum = 0;

		int temp = num;
		while (temp > 0) {
			newNum = newNum * 10 + temp % 10;

			temp = temp / 10;
		}

		if (newNum == num) {
			return true;
		}
		return false;
	}
}
