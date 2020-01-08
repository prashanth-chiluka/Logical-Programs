package com.neo;

public class TestString {

	public static void main(String[] args) {
		String name = "Java"; // 1st String object
		String name_1 = "Java"; // same object referenced by name variable
		String name_2 = new String("Java");

		System.out.println("equals :"+ name.equals(name_1));
		System.out.println("equals :"+ name.equals(name_2));
		System.out.println("equals :"+name_1.equals(name));
		System.out.println("equals :"+ name_1.equals(name_2));
		
		System.out.println(" name == name_1 : "+ name == name_1);
		System.out.println(" name == name_2 : "+ name == name_2);
		System.out.println(" name_1 == name_2 : "+ name_1 == name_2);

		System.out.println(" hashcode == "+(name.hashCode()==name_1.hashCode()));
		System.out.println(" hashcode == "+(name.hashCode()==name_2.hashCode()));
		
		
		String str = "Java is best programming language";

		System.out.println("String contains Java at index :  " + str.indexOf("Java") + " , Index  : "
				+ (str.indexOf("Java") != -1));

		System.out.println("String Starts with J  " + str.matches("J.*"));

		
		String str1 = "Java is best programming language";

		// this will return part of String str from index 0 to 12
		String subString = str1.substring(0, 12);

		System.out.println("Substring: " + subString);
		
		String str2 = "Do you like Java ME or Java EE";

		System.out.println("String contains Java lastly at: " + str2.lastIndexOf("Java") + "   index  :"
				+ (str2.lastIndexOf("Java") != -1));


	}
}
