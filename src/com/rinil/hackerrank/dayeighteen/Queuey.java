/**
 * 
 */
package com.rinil.hackerrank.dayeighteen;

import java.util.LinkedList;
import java.util.Stack;

/**
 * @author rinilnath
 *
 */
public class Queuey {
	LinkedList queue;

	// Making a queue instance
	public Queuey() {
		queue = new LinkedList();
	}

	// Is our queue empty
	public boolean isEmpty() {
		return queue.isEmpty();
	}

	// size of our queue
	public int size() {
		return queue.size();
	}

	// Enqueuening an item
	public void enqueue(int n) {
		queue.addLast(n);
	}

	// Dequeueing an item
	public int dequeue() {
		return (int) queue.remove(0);
	}

	// peek at the first item
	public int peek() {
		return (int) queue.get(0);
	}

	public static void main(String args[]) {
		Stack<String> stacky = new Stack<String>();
		stacky.push("there !");
		stacky.push("hi");
		System.out.print(stacky.pop() + " ");
		System.out.println(stacky.peek());
		System.out.println(stacky.pop());
		Queuey numberQueue = new Queuey();
		numberQueue.enqueue(5);
		numberQueue.enqueue(7);
		numberQueue.enqueue(6);
		System.out.println("first out: " + numberQueue.dequeue());
		System.out.println("sneak peek at second item: " + numberQueue.peek());
		System.out.println("second out: " + numberQueue.dequeue());
		System.out.println("third out: " + numberQueue.dequeue());
	}
}
