package com.rinil.hackerrank.daysixteen;

import java.util.LinkedList;
import java.util.Scanner;

public class Solution {
	LinkedList<String> strList;
	int[] intArray = new int[6];

	Solution() {
		this.strList = null;
	}

	Solution(String str) {
		this.strList = new LinkedList<String>();
		strList.add(str);
	}

	void strCatchException(String str) {
		try {
			Integer strint = Integer.parseInt(str);
			System.out.println(strint);
		} catch (NumberFormatException e) {
			System.out.println("Bad String");
		}
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String S = in.next();

		Solution obj = new Solution();
		obj.strCatchException(S);
	}
}
