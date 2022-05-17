package com.self.practice.bits;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountNumberOfSetBits {

	public static void main(String[] args) {

		assertEquals(2, getSetBits(10));
		assertEquals(4, getSetBits(15));
		assertEquals(1, getSetBits(128));
		assertEquals(5, getSetBits(55));

		int number = 10;
		int result = getSetBits(number);
		System.out.println("No of set Bits in number " + number + " is = " + result);
	}

	private static int getSetBits(int num) {
		int count = 0;

		while (num > 0) {
			if ((num & 1) == 1) {
				count++;
			}

			num = num >> 1;
		}
		return count;
	}
}
