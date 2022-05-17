package com.self.practice.array;

public class Matrix {

	public static void main(String[] args) {
		int[][] arr = { { 1, 0, 0, 0 }, { 0, 0, 0, 0 }, { 1, 0, 1, 0 }, { 1, 1, 0, 0 } };

		int n = arr.length;
		int counter = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (j + 1 < n && arr[i][j] == 1 && arr[i][j + 1] == 1) {
					counter++;
					arr[i][j] = 0;
					arr[i][j + 1] = 0;
				}

				if (i > 0 && arr[i - 1][j] == 1 && arr[i][j] == 1) {
					counter++;
					arr[i - 1][j] = 0;
					arr[i][j] = 0;
				}
			}
		}

		System.out.println("Pairs of (1,1) found = " + counter);
	}
}
