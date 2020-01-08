package com.neo;

public class Print_Prime_Number {

	public static void main(String[] args) {
		int num = 10, count = 0, i;
		for (i = 2; i < num; i++) {
			count = 0;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 0) {
				System.out.println("Prime " + i);
			}
		}
	}

}
