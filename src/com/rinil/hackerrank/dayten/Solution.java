/*
 *Program to convert decimal to binary and print maximum number of consecutive 1s
 * 
 */
package com.rinil.hackerrank.dayten;

import java.util.ArrayList;
import java.util.List;
/**
 * @author rinilnath
 *
 */
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = 0;
		int remainder = -1;
		int max = 1;
		List<Integer> binaryArr = new ArrayList<Integer>();
		List<Integer> iterArr = new ArrayList<Integer>();
		int seqCounter = 1;
		if (n >= 1 && n <= 1000000) {
			while (n > 0) {
				remainder = n % 2;
				n = n / 2;
				binaryArr.add(remainder);
			}
			for (int i = binaryArr.size() - 1; i >= 0; i--) {
				for (; k < binaryArr.size();) {
					iterArr.add(k, binaryArr.get(i));
					k++;
					break;
				}
			}
			for (int j = 0; j < iterArr.size() - 1; j++) {
				if ((iterArr.get(j) == 1)
						&& iterArr.get(j) == iterArr.get(j + 1)) {
					seqCounter++;
				} else {
					seqCounter = 1;
				}
				if (max < seqCounter)
					max = seqCounter;
			}
			System.out.println(max);

		}
	}
}
