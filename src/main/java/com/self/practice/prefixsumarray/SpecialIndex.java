package com.self.practice.prefixsumarray;

import java.util.Arrays;

public class SpecialIndex {

	public static void main(String[] args) {
		int a[] = { 4, 3, 2, 7, 6, -2 };

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

		int specialIndexCount = 0;
		int[] specialIncicesArr = new int[a.length];
		int k = 0;

		for (int i = 0; i < a.length; i++) {
			int sEven = pso[a.length - 1] - pso[i];
			int sOdd = pse[a.length - 1] - pse[i];

			if (i > 0) {
				sEven = pse[i - 1] + sEven;
				sOdd = pso[i - 1] + sOdd;
			}

			if (sEven == sOdd) {
				specialIndexCount++;
				specialIncicesArr[k] = i;
				k++;
			}
		}

		System.out.println("Special Index count = " + specialIndexCount);
		System.out.println("Special Index pos Array = " + Arrays.toString(specialIncicesArr));
	}
}
