package com.self.practice.prefixsumarray;

import java.util.Arrays;

public class EquilibriumIndex2 {

	public static void main(String[] args) {
		//int a[] = { -7, 1, 5, 2, -4, 3 };

		int a[] = { 0, -3, 3, 0 };

		int sumOfArray = 0;

		for (int i = 0; i < a.length; i++) {
			sumOfArray += a[i];
		}

		System.out.println("Input Array=" + Arrays.toString(a));
		System.out.println("Sum of Array = " + sumOfArray);

		int sl = 0;
		int sr;
		int count = 0;
		int[] equiIndexArr = new int[a.length];
		int k = 0;

		for (int i = 0; i < a.length; i++) {

			if (i == 0) {
				sl = 0;
			} else {
				sl = sl + a[i - 1];
			}

			sr = sumOfArray - sl - a[i];

			if (sl == sr) {
				equiIndexArr[k] = i;
				k++;
				count++;
			}
		}

		System.out.println("Equilibrium Index = " + count + " Elems indexes=" + Arrays.toString(equiIndexArr));
	}
}
