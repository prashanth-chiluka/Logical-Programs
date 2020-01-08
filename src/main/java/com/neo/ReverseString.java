package com.neo;

public class ReverseString {

	public static String reverseString(String str) {
		
		if (str.isEmpty()) {
			System.out.println("String in now Empty");
			return str;
		}
		System.out.println("String to be passed in Recursive Function: "+str.substring(1));
		
		return reverseString(str.substring(1)) + str.charAt(0);
	}
	
	
	public static void main(String[] args) {
		String reverse="Prashanth";
		System.out.println(reverse);
		String reversed=reverseString(reverse);
		System.out.println("The reversed string is:"+reversed);
	}
}
