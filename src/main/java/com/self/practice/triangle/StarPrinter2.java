package com.self.practice.triangle;

public class StarPrinter2 {

	public static void main(String[] args) {
		int n = 9;

		for (int i = 0; i < (n + 1) / 2; i++) {
			for (int j = (n + 1) / 2 - i - 1; j > 0; j--) {
				System.out.print(" ");
			}

			for (int k = 0; k <= 2 * i; k++) {
				System.out.print("*");
			}

			System.out.println("");
		}

		for (int i = 0; i < (n + 1) / 2 - 1; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(" ");
			}

			for (int k = n - 2 * (i + 1); k > 0; k--) {
				System.out.print("*");
			}

			System.out.println("");
		}

	}
}
