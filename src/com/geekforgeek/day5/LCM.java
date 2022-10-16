package com.geekforgeek.day5;

public class LCM {

	public static void main(String[] args) {
		int a = 12, b = 15;
		//int lcm = naiveApproach(a, b);
		int lcm = optimalApproach_1(a, b);
		System.out.println("The LCM of "+a+" and "+b+" is :"+lcm);
	}
	
	/*
	 * This is not a optimal solution
	 * Time Complexity O((a*b)-max(a,b))
	 */
	private static int naiveApproach(int a, int b) {
		int max = Math.max(a, b);
		while (true) {
			if (max % a == 0 && max % b == 0) {
				break;
			}
			max++;
		}
		return max;
	}
	/*
	 * optimal solution: 
	 * Formula: LCM(a,b) = a*b/GCD(a,b)
	 * Time Complexity: O(log(min(a,b)))
	 */
	private static int optimalApproach_1(int a,int b) {
		return (a*b)/gcd(a, b);
	}
	
	/*
	 * Using Euclidean Algorithm
	 */
	private static int gcd(int a,int b) {
		if(b==0)
			return a;
		return gcd(b, a%b);
	}

}
