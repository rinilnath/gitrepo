/*
 *	Program to understand linked list
 * 
 */
package com.rinil.hackerrank.dayfifteen;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author rinilnath
 *
 */
class Node {
	int data;
	Node next;

	Node(int d) {
		data = d;
		next = null;
	}
}

public class Solution {
	static LinkedList<Node> myLinkList = new LinkedList<Node>();
	static Node nodeHead = null;
	static Node node = null;

	public static Node insert(Node head, int data) {

		if (head != null) {
			nodeHead = head;
			node.next = new Node(data);
			node = node.next;
			myLinkList.add(node);
			node.next = null;

		} else {
			node = new Node(data);
			myLinkList.add(node);
			node.next = null;
			nodeHead = node;
		}
		return nodeHead;

	}

	public static void display(Node head) {
		Node start = head;
		while (start != null) {
			System.out.print(start.data + " ");
			start = start.next;
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Node head = null;
		int N = sc.nextInt();

		while (N-- > 0) {
			int ele = sc.nextInt();
			head = insert(head, ele);
		}
		display(head);
		sc.close();
	}
}
