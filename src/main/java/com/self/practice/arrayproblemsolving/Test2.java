package com.self.practice.arrayproblemsolving;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Test2 {

	public static void main(String[] args) {
		int a[] = { 8, 1, 2, 3, 1, 3, 4, 3, 5, 2, 1, 6, 7, 3, 4 };

		Map<Integer, Integer> map = new LinkedHashMap<>();

		for (int i = 0; i < a.length; i++) {

			if (map.containsKey(a[i])) {
				map.put(a[i], map.get(a[i]) + 1);
			} else {
				map.put(a[i], 1);
			}
		}

		for (Entry<Integer, Integer> entry : map.entrySet()) {
			System.out.println("key=" + entry.getKey() + " Value=" + entry.getValue());
		}
	}
}
