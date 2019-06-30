/**
 * 
 */
package com.rinil.hackerrank.dayeighteen;

/**
 * Program to learn queue and stack
 * 
 * @author rinilnath
 *
 */
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Solution {
	Queue<Character> queuey;
	Stack<Character> stacky;

	Solution() {
		queuey = new LinkedList<Character>();
		stacky = new Stack<Character>();
	}

	private void pushCharacter(char ch) {
		stacky.push(ch);
	}

	private void enqueueCharacter(char ch) {
		queuey.add(ch);
	}

	private Object popCharacter() {
		return stacky.pop();
	}

	private Object dequeueCharacter() {
		return queuey.remove();
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		scan.close();

		// Convert input String to an array of characters:
		char[] s = input.toCharArray();

		// Create a Solution object:
		Solution p = new Solution();

		// Enqueue/Push all chars to their respective data structures:
		for (char c : s) {
			p.pushCharacter(c);
			p.enqueueCharacter(c);
		}

		// Pop/Dequeue the chars at the head of both data structures and compare
		// them:
		boolean isPalindrome = true;
		for (int i = 0; i < s.length / 2; i++) {
			if (p.popCharacter() != p.dequeueCharacter()) {
				isPalindrome = false;
				break;
			}
		}

		// Finally, print whether string s is palindrome or not.
		System.out.println("The word, " + input + ", is "
				+ ((!isPalindrome) ? "not a palindrome." : "a palindrome."));
	}

}