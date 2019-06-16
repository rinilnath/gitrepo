/**
 * Program to match name with phone number using map
 * 
 */
package com.rinil.hackerrank.dayeight;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author rinilnath
 *
 */
public class Solution {
	public static void main(String[] argh) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Map<String, Integer> phoneBookMap = new HashMap<String, Integer>();
		int phoneNum = 0;
		int queryCounter = 0;
		if (n >= 1 && n <= 100000)
			for (int i = 0; i < n; i++) {
				String name = in.next();
				int phone = in.nextInt();
				phoneBookMap.put(name, phone);
			}
		while (in.hasNext() && queryCounter <= 100000) {
			String s = in.next();
			if (phoneBookMap.containsKey(s)) {
				phoneNum = phoneBookMap.get(s);
				System.out.println(s + "=" + phoneNum);
			} else {
				System.out.println("Not found");
			}
			queryCounter++;
		}
		in.close();
	}
}
