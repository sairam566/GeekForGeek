package com.geekforgeek.day6;

public class CheckPrime {

	public static void main(String[] args) {
		
		int n=121;
		//boolean value = isPrime(n);
		//boolean value = optimalApproach_1(n);
		boolean value = optimalApproach_2(n);
		String isPrimeNo = (value)?" Prime":" Not Prime";
		System.out.println("The Given number "+n+" is "+isPrimeNo);
		
	}

	/*
	 * Not Effective Solution Time Complexity: O(n)
	 */
	private static boolean isPrime(int n) {
		if(n==1)
			return false;
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	
	/*
	 *	Time Complexity: O(SquareRoot(n)) 
	 */
	private static boolean optimalApproach_1(int n) {
		if(n==1)
			return false;
		for(int i=2;i*i<=n;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}

	private static boolean optimalApproach_2(int n) {
		if(n==1)
			return false;
		if(n==2 || n==3)
			return true;
		if(n%2==0 || n%3==0)
			return false;
		for(int i=5;i*i<=n;i=i+6) {
			if(n%i==0 || n%(i+2)==0) {
				return false;
			}
		}
		return true;
	}

}
