/**
 * Program to split even and odd string indices
 */
package com.rinil.hackerrank.daysix;

import java.util.Scanner;

/**
 * @author rinilnath
 *
 */
public class Solution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		String[] input = new String[t];
		String str = new String();
		String evenStr = new String();
		String oddStr = new String();
		char evenChar = 'a';
		char oddChar = 'a';
		if (t >= 1 && t <= 10) {
			for (int i = 0; i < t; i++) {
				input[i] = in.next();
			}
			if (input.length >= 2 && input.length <= 10000)
				for (int j = 0; j < input.length; j++) {
					str = input[j];
					for (int k = 0; k < str.toCharArray().length; k++) {
						if (k % 2 == 0) {
							evenChar = str.charAt(k);
							evenStr += evenChar;

						}

						else {
							oddChar = str.charAt(k);
							oddStr += oddChar;
						}

					}
					System.out.print(evenStr + " " + oddStr);
					evenStr = new String();
					oddStr = new String();
					System.out.println();
				}

		}
	}
}
