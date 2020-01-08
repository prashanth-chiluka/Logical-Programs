package com.neo;

public class PalindromeNumber {
	public static void main(String[] args) {
		int num=121;
		int sum=0,rem;
		while (num!=0) {
			sum=sum*10;
			rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		System.out.println(sum);
	}
}
