package com.self.practice.matrix;

public class SquareMatrixSprialOrderPrint {

	public static void main(String[] args) {
		int a[][] = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 },
				{ 21, 22, 23, 24, 25 } };

		/*
		 * Print in Sprial Order -->
		 * 1,2,3,4,5,10,15,20,25,24,23,22,21,16,11,6,7,8,9,14,19,18,17,12,13
		 * 
		 */

		int i = 0, j = 0;

		int n = a.length;

		while (n > 0) {

			// Print row - 0 till n-2 positions [0, 0...n-2]
			for (int k = 1; k < n; k++) {
				System.out.print(a[i][j] + ",");
				j++;
			}

			// Print column - n-1 till n-2 positions [0...n-2, n-1]
			for (int k = 1; k < n; k++) {
				System.out.print(a[i][j] + ",");
				i++;
			}

			// Print row - n-1 in reverse till n-2 positions [n-1, n-1....1]
			for (int k = 1; k < n; k++) {
				System.out.print(a[i][j] + ",");
				j--;
			}

			// Print column - 0 in reverse till n-2 positions [n-1.....1, 0]
			for (int k = 1; k < n; k++) {
				System.out.print(a[i][j] + ",");
				i--;
			}

			// now i=0, j=0

			// Consider odd case when n becomes 1
			if ((n & 1) > 0) {
				System.out.print(a[i][j] + ",");
			}

			i++;
			j++;

			n = n - 2;
		}
	}
}
