package com.self.practice.prefixsumarray;

import java.util.Arrays;

public class PrefixEvenOddSum {

	public static void main(String[] args) {
		int a[] = { -7, 1, 5, 2, -4, 3 };

		int pse[] = new int[a.length];
		int pso[] = new int[a.length];

		pse[0] = a[0];

		for (int i = 1; i < a.length; i++) {
			if (i % 2 == 1) {
				pse[i] = pse[i - 1];
			} else {
				pse[i] = pse[i - 1] + a[i];
			}
		}

		pso[0] = 0;
		pso[1] = a[1];

		for (int i = 2; i < a.length; i++) {
			if (i % 2 == 0) {
				pso[i] = pso[i - 1];
			} else {
				pso[i] = pso[i - 1] + a[i];
			}
		}

		System.out.println("Input Array=" + Arrays.toString(a));
		System.out.println("Prefix Even Array Sum=" + Arrays.toString(pse));
		System.out.println("Prefix Odd Array Sum=" + Arrays.toString(pso));
	}
}
