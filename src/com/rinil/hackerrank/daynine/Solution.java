/**
 * Program to find factorial using recursion
 */
package com.rinil.hackerrank.daynine;

import java.util.Scanner;

public class Solution {

	static int factorial(int n) {
		if (n >= 2 && n <= 12)
			n = n * factorial(n - 1);
		else if (n <= 1)
			return 1;
		else
			System.exit(0);
		return n;

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int result = factorial(n);
		in.close();
		System.out.println(result);
	}
}
