package com.neo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class SplitArray {
	
	public static void main(String[] args) {
		List<Integer> unique = new ArrayList<Integer>();
		List<Integer> nonunique = new ArrayList<Integer>();
		int[] spam = { 1, 2, 3, 4, 5, 5 };
		HashSet<Integer> set = new HashSet<>();
		boolean flag = true;
		for (int i = 0; i < spam.length; i++) {
			set.add(spam[i]);
			int next = 1 + i;
			
			if (next < spam.length && set.contains(spam[next])) {
				nonunique.add(spam[i]);
				nonunique.add(spam[i]);
			} else if (spam.length > next) {
				unique.add(spam[i]);
			}
		}

		System.out.println(unique + " " + nonunique);
	}
	public static void main1(String[] args) {

		int[] inp = { 1, 2, 3, 4, 5 };
		int n = inp.length;

		int[] a = new int[(n + 1)/2];
		int[] b = new int[n - a.length];

		for (int i = 0; i < n; i++)
		{
			if (i < a.length)
				a[i] = inp[i];
			else
				b[i - a.length] = inp[i];
		}

		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
	}
	
	static int findSplitPoint(int arr[]) {
		int n = arr.length;
		int leftSum = 0;

		// traverse array element
		for (int i = 0; i < n; i++) {
			// add current element to left Sum
			leftSum += arr[i];

			// find sum of rest array
			// elements (rightSum)
			int rightSum = 0;

			for (int j = i + 1; j < n; j++)
				rightSum += arr[j];

			// split point index
			if (leftSum == rightSum)
				return i + 1;
		}

		// if it is not possible to
		// split array into two parts
		return -1;
	}

	// Prints two parts after finding
	// split point using findSplitPoint()
	static List<List<Integer>> printTwoParts(int arr[]) {
		int n = arr.length;
		int splitPoint = findSplitPoint(arr);

		/*
		 * if (splitPoint == -1 || splitPoint == n ) {
		 * System.out.println("Not Possible"); return; }
		 */

		List<List<Integer>> list = new ArrayList<>();
		List<Integer> a = new ArrayList<>(splitPoint);
		int j = 0;
		for (int i = 0; i < n; i++) {

			if (splitPoint == i) {
				list.add(a);
				a = new ArrayList<>(splitPoint);
				j = 0;

			}

			a.add(arr[i]);

		}
		list.add(a);

		return list;
	}

	// Driver program

}

