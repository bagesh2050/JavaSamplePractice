package com.self.practice.triangle;

public class TriangleDemo {

	public static void main(String[] args) {

		int n = 9;

		for (int i = 0; i < n; i++) {

			for (int k = i; k < n - 1; k++) {
				System.out.print(" ");
			}

			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.print("\n");
		}

		for (int i = 0; i < n - 1; i++) {

			for (int k = 0; k <= i; k++) {
				System.out.print(" ");
			}

			for (int j = 0; j < n - 1 - i; j++) {
				System.out.print("* ");
			}
			System.out.print("\n");
		}

	}
}
