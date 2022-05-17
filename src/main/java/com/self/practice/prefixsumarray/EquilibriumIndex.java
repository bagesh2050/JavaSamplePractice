package com.self.practice.prefixsumarray;

import java.util.Arrays;

public class EquilibriumIndex {

	public static void main(String[] args) {
		int a[] = { -7, 1, 5, 2, -4, 3 };

		int ps[] = new int[a.length];

		ps[0] = a[0];

		for (int i = 1; i < a.length; i++) {
			ps[i] = ps[i - 1] + a[i];
		}

		System.out.println("Input Array=" + Arrays.toString(a));
		System.out.println("Prefix Sum Array=" + Arrays.toString(ps));

		int sl;
		int sr;
		int count = 0;
		int[] equiIndexArr = new int[a.length];
		int k = 0;

		for (int i = 0; i < a.length; i++) {

			if (i == 0) {
				sl = 0;
			} else {
				sl = ps[i - 1];
			}

			sr = ps[a.length - 1] - ps[i];

			if (sl == sr) {
				equiIndexArr[k] = i;
				k++;
				count++;
			}
		}

		System.out.println("Equilibrium Index = " + count + " Elems indexes=" + Arrays.toString(equiIndexArr));
	}
}
