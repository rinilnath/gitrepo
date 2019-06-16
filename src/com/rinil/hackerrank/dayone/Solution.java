/**
 * 
 */
package com.rinil.hackerrank.dayone;

/**
 * @author rinilnath
 *
 */
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		int i = 4;
		double d = 4.0;
		String s = "HackerRank ";

		Scanner scan = new Scanner(System.in);

		int inputInt = -1;
		double inputDouble = 0.0;
		String inputString = "";
		inputInt = Integer.parseInt(scan.nextLine());
		inputDouble = Double.parseDouble(scan.nextLine());
		inputString = scan.nextLine();
		System.out.println(i + inputInt);
		System.out.println(d + inputDouble);
		System.out.println(s + inputString);
		scan.close();
	}
}
