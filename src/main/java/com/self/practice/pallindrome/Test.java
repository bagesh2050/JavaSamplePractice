package com.self.practice.pallindrome;

public class Test {

	public static void main(String[] args) {
		//String str = "madam";

		String str = "bagesh";

		if (isPallindrome(str)) {
			System.out.println(str + " is a Pallindrome.");
		} else {
			System.out.println(str + " is not a Pallindrome.");
		}
	}

	static boolean isPallindrome(String str) {
		for (int i = 0; i <= str.length() / 2; i++) {
			if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
				return false;
			}
		}
		return true;
	}
}
