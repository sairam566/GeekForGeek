package com.geekforgeek.day3;

public class TrailingZerosInFactorial {

	public static void main(String[] args) {
	
		int inputNo = 16;
		int factoial = factorial(inputNo);
		//int zeroCount = countZerosV1(factoial);
		int zeroCount = countZerosV2(factoial);
		System.out.println("Zeros In Factorial "+factoial+" is "+zeroCount);
		
	}
	
	public static int factorial(int inputNo) {
		int factorial =1;
		for(int i=2;i<=inputNo;i++) {
			factorial = factorial * i;
		}
		return factorial;
	}
	
	/* 	
	 * 	Not a effective solution and have overflow problem.
	 *	Eg.. For after 16 factorial the int cannot hold the value
	 *	16 --> 2004189184
	 */
	private static int countZerosV1(int factorial) {
		int counter = 0;
		while(factorial>0) {
			int digit = factorial%10;
			if(digit==0) {
				counter++;
			}else {
				break;
			}
			factorial = factorial/10;
		}
		return counter;
	}
	
	/* 	
	 *  Just code is optimized from countZerosV1 method.
	 *	All the problems that are present in countZerosV1 method are present here also.
	 */
	private static int countZerosV2(int factorial) {
		int counter = 0;
		while(factorial%10==0) {
			counter++;
			factorial = factorial/10;
		}
		return counter;
	}
	
	/*
	 *  This problem cannot be solved by using loops 
	 *  Need to apply mathematical formula for the solution and avoid
	 *  overflow problem.
	 */
	

}
