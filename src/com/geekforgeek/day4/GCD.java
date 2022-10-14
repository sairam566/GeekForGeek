package com.geekforgeek.day4;

public class GCD {

	public static void main(String[] args) {
		int a=12,b=15;
		//int gcd = naiveApproach(a, b);
		//int gcd = optimalApproach_1(a, b);
		int gcd = optimalApproach_2(a, b);
		System.out.println("The GCD of "+a+" and "+b+" is: "+gcd);
		
	}
	
	/*
	 * This is not an optimal solution 
	 * Time Complexity O(min(a,b))
	 */
	private static int naiveApproach(int a,int b) {
		int min = Math.min(a, b);
		while(min>0) {
			if(a%min == 0 && b%min==0) {
				break;
			}
			min--;
		}
		return min;
	}
	
	/*
	 * It is an optimal solution but still we can improve
	 * by eliminating subtraction operation 
	 */
	private static int optimalApproach_1(int a,int b) {
		while(a!=b) {
			if(a>b)
				a = a-b;
			else
				b = b-a;
		}
		return a;
	}
	
	/*
	 * Optimal approach
	 */
	private static int optimalApproach_2(int a,int b) {
		if(b==0) {
			return a;
		}
		return optimalApproach_2(b, a%b);
	}
}
