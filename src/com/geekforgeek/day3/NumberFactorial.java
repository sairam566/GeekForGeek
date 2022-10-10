package com.geekforgeek.day3;

public class NumberFactorial {

	public static void main(String[] args) {

		int inputNo = 5, factorial = 0;
		//factorial = factorial(inputNo);
		factorial = factorialRec(inputNo);
		System.out.println("Factorial of " + inputNo + " is: " + factorial);

	}

	public static int factorial(int inputNo) {
		int factorial = 1;
		for (int i = 2; i <= inputNo; i++) {
			factorial = factorial * i;
		}
		return factorial;
	}

	public static int factorialRec(int inputNo) {
		if (inputNo == 0) {
			return 1;
		}
		return inputNo * factorial(inputNo - 1);
	}

}
