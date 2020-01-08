package com.neo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sorting {

	public static void main(String[] args) {

		List<String> array = Arrays.asList("a", "b", "c");
		List<String> array1 = Arrays.asList("1", "2", "3");
		List<String> array3 = new ArrayList<>();

		for (int i = 0; i < array.size(); i++) {
			array3.add(array.get(i).toString());
			array3.add(array1.get(i));
		}

		System.out.println(array3);

		List<Integer> array4 = Arrays.asList(1, 2, 3, 4, 5, 6);
		System.out.println(array4.stream().filter(a -> a % 3 == 0).mapToInt(a -> a * a).sum());
	}
}
