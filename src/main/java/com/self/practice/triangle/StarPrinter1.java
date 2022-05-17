package com.self.practice.triangle;

public class StarPrinter1 {

	public static void main(String[] args) {
		int n = 9;

		for (int i = 0; i < n; i++) {

			for (int j = n - i - 1; j > 0; j--) {
				System.out.print(" ");
			}

			for (int k = 0; k <= i; k++) {
				System.out.print("* ");
			}

			System.out.println("");
		}

		for (int i = 1; i < n; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}

			for (int k = n - i; k > 0; k--) {
				System.out.print("* ");
			}

			System.out.println("");
		}
	}
}
