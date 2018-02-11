/**
 * Program to explain inheritance concept
 */
package com.rinil.hackerrank.daytwelve;

import java.util.Scanner;

/**
 * @author rinilnath
 *
 */

class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;

	// Constructor
	Person(String firstName, String lastName, int identification) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}

	// Print person data
	public void printPerson() {
		System.out.println("Name: " + lastName + ", " + firstName + "\nID: "
				+ idNumber);
	}

}

class Student extends Person {
	private int[] testScores;

	Student(String firstName, String lastName, int identification) {
		super(firstName, lastName, identification);
	}

	public Student(String firstName, String lastName, int id, int[] testScores) {
		super(firstName, lastName, id);
		this.testScores = testScores;
		if ((firstName.length() < 1 || firstName.length() > 10)
				|| (lastName.length() < 1 || lastName.length() > 10)
				|| (String.valueOf(id).length() > 7))
			System.exit(0);
	}

	/*
	 * Class Constructor
	 * 
	 * @param firstName - A string denoting the Person's first name.
	 * 
	 * @param lastName - A string denoting the Person's last name.
	 * 
	 * @param id - An integer denoting the Person's ID number.
	 * 
	 * @param scores - An array of integers denoting the Person's test scores.
	 */
	// Write your constructor here
	public char calculate() {
		char grade = ' ';
		int sum = 0;
		int avg = 0;
		int noofscores = 0;
		for (int i = 0; i < testScores.length; i++) {
			if (testScores[i] < 0 || testScores[i] > 100)
				System.exit(0);
			sum += testScores[i];
			noofscores++;
		}
		avg = sum / noofscores;
		if (avg < 0 || avg > 100)
			System.exit(0);
		if (avg <= 100 && avg >= 90) {
			return 'O';
		} else if (avg >= 80 && avg < 90)
			return 'E';
		else if (avg >= 70 && avg < 80)
			return 'A';
		else if (avg >= 55 && avg < 70)
			return 'P';
		else if (avg >= 40 && avg < 55)
			return 'D';
		else
			return 'T';

	}
}

class Solution {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for (int i = 0; i < numScores; i++) {
			testScores[i] = scan.nextInt();
		}
		scan.close();
		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate());
	}
}
