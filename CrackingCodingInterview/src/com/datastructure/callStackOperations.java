package com.datastructure;

public class callStackOperations {

	public static void main(String[] args) {
		StackDataStructure stack = new StackDataStructure();
		stack.push(0);
		stack.push(21);
		stack.push(2);
		stack.push(1);
		stack.push(3);
		stack.pop();
		stack.pop();
		stack.display();
	}

}
