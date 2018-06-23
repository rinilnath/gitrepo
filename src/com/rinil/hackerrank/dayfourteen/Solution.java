/**
 * Program to learn the scope of variables.
 * Program uses a Java 8 feature to depict the unsigned int operations.
 */
package com.rinil.hackerrank.dayfourteen;

/**
 * @author rinilnath
 *
 */
import java.util.Scanner;

class Difference {
	private int[] elements;
	public int maximumDifference;

	public Difference(int[] a) {
		this.elements = a;
	}

	protected int computeDifference() {
		Integer temp = 0;
		maximumDifference = 0;
		if (elements.length >= 1 && elements.length <= 10) {
			for (int i = 0; i < elements.length; i++) {
				if (elements[i] >= 1 && elements[i] <= 100) {
					for (int j = i + 1; j < elements.length; j++) {
						temp = Integer
								.compareUnsigned(elements[i], elements[j]);
						if (temp >= 0) {
							temp = elements[i] - elements[j];
						} else {
							temp = elements[j] - elements[i];
						}

						if (temp > maximumDifference)
							maximumDifference = temp;
					}
				} else {
					System.exit(-1);
				}
			}
		} else {
			System.exit(-1);
		}
		return maximumDifference;
	}
} // End of Difference class

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();

		Difference difference = new Difference(a);

		difference.computeDifference();

		System.out.print(difference.maximumDifference);
	}
}