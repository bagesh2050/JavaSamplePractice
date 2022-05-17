package com.self.practice.matrix;

public class MaxColumnSum {

	public static void main(String[] args) {
		int a[][] = { { 3, 8, 9, 2 }, { 1, 2, 3, 6 }, { 4, 10, 11, 17 } };

		int maxSum = Integer.MIN_VALUE;

		System.out.println(maxSum);

		for (int i = 0; i < a[0].length; i++) {
			int temp = 0;
			for (int j = 0; j < a.length; j++) {
				temp = temp + a[j][i];
			}

			if (maxSum < temp) {
				maxSum = temp;
			}
		}

		for (int i = 0; i < a.length; i++) {
			for (int j = i; j >= 0; j--) {
				System.out.println(a[i - j][j]);
			}
		}

		System.out.println("Max column Sum=" + maxSum);
	}
}
