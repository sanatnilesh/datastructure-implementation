package com.datastructure;

public class StackDataStructure {
	int top = -1;
	int capacity = 10;
	int stack[] = new int[capacity];

	public int pop() {
		if (top == -1) {
			System.out.println("Empty stack.......");
			return -1;
		} else {
			return stack[top--];
		}
	}

	public void push(int d) {
		if (capacity == top) {
			System.out.println("Stack capacity is full...");
		} else {
			top = top + 1;
			stack[top] = d;
		}
	}

	public void display() {
		if (top == -1) {
			System.out.println("The given stack is already empty...");
		} else {
			while (top != -1) {
				System.out.print(stack[top--] + " ");
			}
		}
	}
}
