package com.geekforgeek.day7;

public class SearchElement {

	public static void main(String[] args) {
		int[] arr = { 20, 5, 7, 25 };
		int elementToSearch = 5;
		int index = searchGivenIndex(arr, elementToSearch, elementToSearch);
		System.out.println("The index of element " + elementToSearch + " is: " + index);
	}
	
	/*
	 * Time Complexity : O(N)
	 * Linear Growth
	 */
	static int searchGivenIndex(int[] arr, int arrLength, int elementToSearch) {
		for (int i = 0; i < arrLength; i++) {
			if (arr[i] == elementToSearch) {
				return i;
			}
		}
		return -1;
	}

}
