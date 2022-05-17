package com.self.practice.array;
public class ArrayRotation {

	public static void main(String... strings) {

		int a[] = { 1, 2, 3, 4, 5 };
		int res[] = a;

		int k = 7;

		for (int i = 0; i < k % a.length; i++) {

			for (int j = 0; j < a.length; j++) {
				int temp = res[0];

				if (j == a.length - 1) {
					res[j] = temp;
				}

				if (j < a.length - 1) {
					int temp1 = res[j];
					int temp2 = res[j + 1];

					res[j] = temp2;
				}
			}
		}

		// Arrays.asList(res).stream().forEach(System.out::println);

		for (int p = 0; p < res.length; p++) {
			System.out.println(res[p]);
		}
	}
}
