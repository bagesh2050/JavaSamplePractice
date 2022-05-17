package com.self.practice.pallindrome;

public class Test2 {

	public static void main(String[] args) {

		for (int i = 0; i <= 9; i++) {
			for (int j = 0; j <= 9; j++) {
				int num = 100 * i + (i + 10 * j);

				if (num < 100) {
					num = num + j;
				}

				if (num == 0)
					continue;

				System.out.println(num);
			}
		}
	}
}
