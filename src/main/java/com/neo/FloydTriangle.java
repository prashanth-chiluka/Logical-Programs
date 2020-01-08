package com.neo;

public class FloydTriangle {

	public static void main(String[] args) {
		int temp=1;
		for (int i = 1; i < 5; i++) {
			System.out.println(" ");
			for (int j = 1; j<=i; j++) {
				System.out.print(temp+" ");
				temp++;
			}
		}
	}

}
