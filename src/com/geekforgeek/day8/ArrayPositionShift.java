package com.geekforgeek.day8;

public class ArrayPositionShift {

	public static void main(String[] args) {
		int[] arr = new int[5];
		int arrSize = arr.length;
		arr[0] = 1;
		arr[1] = 3;
		arr[2] = 4;

		// Now array looks link {1,3,4,0,0}
		int noOfElements = 3;
		int position = 2;
		int number = 2;
		System.out.println("Elements Before insertion");

		for (int i = 0; i < noOfElements; i++) {
			System.out.print(" " + arr[i]);
		}

		noOfElements = insert(arr, noOfElements, position, arrSize, number);

		System.out.println("\n Elements After insertion");

		for (int i = 0; i < noOfElements; i++) {
			System.out.print(" " + arr[i]);
		}
	}

	/*
	 * Time Complexity: O(n)
	 * Insert at the end: O(1)
	 * Insert at the Beginning: O(n)
	 */
	static int insert(int[] arr, int noOfElements, int position, int arrSize, int number) {

		if (noOfElements == arrSize) {
			return noOfElements;
		}

		int index = position - 1;

		for (int i = noOfElements - 1; i >= index; i--) {
			arr[i + 1] = arr[i];
		}
		arr[index] = number;

		return noOfElements + 1;

	}

}
