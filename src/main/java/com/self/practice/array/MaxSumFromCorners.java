package com.self.practice.array;

public class MaxSumFromCorners {

	public static void main(String[] args) {
		int[] a = { -2, 100, 500, -4, 500, 2, 1000 };
		int b = 4;

		int leftSum = 0;
		int rightSum = 0;

		for (int i = 0; i < b; i++) {
			leftSum = leftSum + a[i];
		}

		int l = b - 1;
		int r = a.length - 1;

		int answer = Integer.MIN_VALUE;

		while (l >= 0) {
			answer = Math.max(answer, leftSum + rightSum);

			leftSum = leftSum - a[l];
			rightSum = rightSum + a[r];

			l--;
			r--;
		}

		answer = Math.max(answer, rightSum);

		System.out.println("Maximum sum =" + answer);
	}

}
