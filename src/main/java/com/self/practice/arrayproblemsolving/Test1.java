package com.self.practice.arrayproblemsolving;

public class Test1 {

	public static void main(String[] args) {

		int a[] = { 0, 1, 1, 1, 0, 1, 1, 0, 1, 1, 0 };
		int count = Integer.MIN_VALUE;
		int index = -1;

		for (int i = 0; i < a.length; i++) {

			int temp = 0;

			if (a[i] == 0) {
				for (int j = i; j < a.length; j++) {
					if (a[j] == 1) {
						temp++;
					} else {
						break;
					}
				}
			}

			if (count < temp) {
				count = temp + 1;
				index = i;
			}
		}

		System.out.println("Max no of Consecutive 1 after replcing 0 with 1 =" + count + " at index=" + index);
	}
}
