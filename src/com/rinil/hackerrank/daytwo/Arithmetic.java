/**
 * 
 */
package com.rinil.hackerrank.daytwo;

/**
 * @author rinilnath
 *
 */
import java.util.Scanner;

public class Arithmetic {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double mealCost = scan.nextDouble(); // original meal price
		double tipPercent = scan.nextInt(); // tip percentage
		double taxPercent = scan.nextInt(); // tax percentage
		scan.close();
		// Write your calculation code here.
		tipPercent = (mealCost * (tipPercent / 100));
		taxPercent = (mealCost * (taxPercent / 100));
		// cast the result of the rounding operation to an int and save it as
		mealCost = mealCost + tipPercent + taxPercent;
		int totalCost = (int) Math.round(mealCost);/* numberToRoundHere */
		System.out.println("The total meal cost is " + totalCost + " dollars.");

		// Print your result
	}
}