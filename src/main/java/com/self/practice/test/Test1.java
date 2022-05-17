package com.self.practice.test;

public class Test1 {

	public static void main(String[] args) {

		MONTH m1 = MONTH.JAN;
		MONTH m2 = MONTH.JAN;
		MONTH m3 = MONTH.FEB;

		System.out.println(m1 == m2);
		System.out.println(m1.equals(m2));
		System.out.println(m1 == m3);
		System.out.println(m1.equals(m3));

		Integer[][] ints = { { 1, 2, 3 }, { 3, 4 }, { 4, 5, 6 } };

		System.out.println("value=" + ints[1][2].intValue());
	}

	enum MONTH {
		JAN, FEB, MARCH
	}

}
