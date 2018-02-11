/**
 * Program to compute 2D arrays
 */
package com.rinil.hackerrank.dayeleven;

/**
 * @author rinilnath
 *
 */
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int max = -63; // to give max -consider maximum sum of extreme negative
						// constraint in hourglass position
		int arr[][] = new int[6][6];
		int hrow = 0;
		int hcol = 0;
		int hourGlassArr[][] = new int[3][3];
		int sum = 0;
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				arr[i][j] = in.nextInt();
				if (arr[i][j] <= -9 && arr[i][j] >= 9) {
					in.close();
					System.exit(0);
				}
			}
		}
		in.close();
		for (int m = 0; m < 4; m++) {
			for (int q = 0; q < 4; q++) {
				for (int k = m; k < 3 + m; k++) {
					for (int l = q; l < 3 + q; l++) {
						hourGlassArr[hrow][hcol] = arr[k][l];
						hcol++;
					}
					hrow++;
					hcol = 0;
				}
				hrow = 0;
				for (int n = 0; n < hourGlassArr.length; n++) {
					for (int p = 0; p < hourGlassArr.length; p++) {
						if ((n == 1 && p == 0) || (n == 1 && p == 2))
							continue;
						sum += hourGlassArr[n][p];
					}
				}
				if (sum > max)
					max = sum;
				sum = 0;
				hourGlassArr = new int[3][3];
			}
		}
		System.out.println(max);

	}
}
