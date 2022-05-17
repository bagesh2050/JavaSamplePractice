package com.self.practice.triangle;

public class StarPrinter {

	public static void main(String... strings) {

		int num = 5;

		printTriangle(num);
		printReverseTriangle(num);
	}

	static void printTriangle(int num) {
		for (int i = (num + 1) / 2; i >= 0; i--) {
			for (int j = 0; j < num; j++) {
				if (j >= i && j <= (num - i - 1)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}

			System.out.print("\n");
		}
	}

	static void printReverseTriangle(int num) {
		for (int i = 1; i < (num + 1) / 2; i++) {
			for (int j = 0; j < num; j++) {
				if (j >= i && j <= (num - i - 1)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}

			System.out.print("\n");
		}
	}

}
