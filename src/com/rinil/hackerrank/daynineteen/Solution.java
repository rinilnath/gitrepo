/**
 * 
 */
package com.rinil.hackerrank.daynineteen;

/**
 * Class to learn on interface implementation
 * @author rinilnath
 *
 */
import java.util.Scanner;

interface AdvancedArithmetic {
	int divisorSum(int n);
}

class Calculator implements AdvancedArithmetic {
	public int divisorSum(int n) {
		int sum = 0;
		if (n >= 1 && n <= 1000) {
			int i = 1;
			while (i <= n) {
				if (n % i == 0)
					sum += i;
				i++;
			}
		} else {
			System.exit(0);
		}
		return sum;
	}
}

class Solution {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();

		AdvancedArithmetic myCalculator = new Calculator();
		int sum = myCalculator.divisorSum(n);
		System.out.println("I implemented: "
				+ myCalculator.getClass().getInterfaces()[0].getName());
		System.out.println(sum);
	}
}