package com.geekforgeek.day1;

public class CountDigits {

	public static void main(String[] args) {

		int number = 54895400;
		int counter = 0;
		while (number > 0) {
			// this will take put last digit from the number
			number = number / 10;
			counter++;
		}
		System.out.println("NO.Of Digits: " + counter);
	}

}
