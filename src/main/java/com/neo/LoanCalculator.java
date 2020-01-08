package com.neo;

import java.util.Scanner;

public class LoanCalculator {
	public static void main(String[] args) {

		int loanAmount = 0, n = 0;
		float i = 0.0f, p = 0.0f;
		System.out.println("Enter Loan Amount");
		Scanner sc = new Scanner(System.in);
		loanAmount = sc.nextInt();
		System.out.println("Enter Tenure");
		n = sc.nextInt();
		System.out.println("Enter Rate Of Interest");
		i = sc.nextFloat();
		
		n = n * 12;
		
		i = i / 12;

		final float DISCOUNT = (float) ((Math.pow((1 + i), n) - 1) / (i * (Math.pow((1 + i), n))));

		p = loanAmount / DISCOUNT;
		System.out.println("Total Principal Amount with Interest:" + p);
		System.out.println("Monthly EMI: " + p / n);

	}
}