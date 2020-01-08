package com.neo;

public class PrimeNumber {
	public static void main(String[] args) {
		int num=101,div=2,count=0;
		while (div<num/2) {
			if (num%div==0) {
				System.out.println("Not ");
				count++;
				break;
			}else {
				div++;
			}
			
		}if (count==0) {
			System.out.println("Prime");
		}
	}
}
