package com.neo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

class TestIterator {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();

		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");

		// Iterator to traverse the list
		Iterator iterator = list.iterator();

		System.out.println("List elements : ");

		while (iterator.hasNext())
			System.out.print(iterator.next() + " ");

		System.out.println();

		System.out.println("_________________________");
		
		System.out.println("ArrayList: " + list);

// Creating object of ListIterator<String> 
// using listIterator() method 
		ListIterator<String> listIterator = list.listIterator();

// Printing the iterated value 
		System.out.println("\nUsing ListIterator:\n");
		while (listIterator.hasNext()) {
			System.out.println("Value is : " + listIterator.next());
		}
		System.out.println("-------------------------");
		while (listIterator.hasPrevious()) {
			System.out.println("Value is : " + listIterator.previous());
		}

	}

}
