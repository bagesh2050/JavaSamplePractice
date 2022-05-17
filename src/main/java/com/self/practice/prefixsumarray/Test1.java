package com.self.practice.prefixsumarray;

public class Test1 {

	public static void main(String[] args) {
		int a[] = { -3, 6, 2, 4, 5, 2, 8, -9, 3 };

		int ps[] = new int[a.length];

		ps[0] = a[0];

		for (int i = 1; i < a.length; i++) {
			ps[i] = ps[i - 1] + a[i];
		}

		System.out.println("Input Array=" + printArray(a));
		System.out.println("Prefix Sum Array=" + printArray(ps));

		System.out.println("Sum of element from index 3 to 7 is = " + (ps[7] - ps[2]));
	}

	static String printArray(int[] arr) {
		StringBuilder sb = new StringBuilder();
		for (int val : arr) {
			sb.append(String.valueOf(val));
			sb.append(" ");
		}

		return sb.toString();
	}
}
