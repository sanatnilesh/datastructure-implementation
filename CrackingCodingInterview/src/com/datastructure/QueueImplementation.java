package com.datastructure;

public class QueueImplementation {
	
	public static void main(String[] args) {
		Node node = new Node(1);
		node.appendToEnd(2);
		node.appendToEnd(3);
		node.appendToEnd(4);
		node.appendToEnd(5);
		int temp  = node.deleteFromFront();
		System.out.println("Data removed " + temp);
		temp = node.deleteFromFront();
		System.out.println("Data removed " + temp);
		node.print();
	}

}
