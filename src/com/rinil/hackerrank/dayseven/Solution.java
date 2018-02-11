/**
 * program to print array in reverse
 */
package com.rinil.hackerrank.dayseven;

import java.util.Scanner;

/**
 * @author rinilnath
 *
 */
public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		if (n >= 1 && n <= 1000) {
			int[] arr = new int[n];

			for (int i = 0; i < n; i++) {
				arr[i] = in.nextInt();
			}
			in.close();
			for (int j = (arr.length) - 1; j >= 0; j--) {
				if (arr[j] > 0 && arr[j] < 10001)
					System.out.print(arr[j] + " ");
			}
		}

	}
}
