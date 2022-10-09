package com.geekforgeek.day2;

public class PalindromeNumberCheck {

	public static void main(String[] args) {
		int inputNumber = 16461;
		int reverseNo = 0;
		int temp = inputNumber;

		while (temp > 0) {
			int digit = temp % 10;
			reverseNo = (reverseNo * 10) + digit;
			temp /= 10;
		}
		String val = (inputNumber == reverseNo) ? "Palindrome" : "Not Palindrome";
		System.out.println("The given Number: " + inputNumber + " is " + val);
	}

}
