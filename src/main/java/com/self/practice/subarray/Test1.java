package com.self.practice.subarray;

public class Test1 {

	public static void main(String[] args) {
		int a[] = { 2, 8, 9 };

		for (int i = 0; i < a.length; i++) {
			int subArrySum = 0;
			for (int j = i; j < a.length; j++) {
				subArrySum = subArrySum + a[j];
				System.out.println(subArrySum);
			}
		}
	}

}
