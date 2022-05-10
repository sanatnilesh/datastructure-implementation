package com.datastructure;

public class Node {
	Node next;
	int data;

	public Node(int data) {
		this.data = data;
		this.next = null;
	}

	public Node head = null;

	public void appendToEnd(int d) {
		Node newNode = new Node(d);
		Node temp = head;
		if (head == null) {
			head = newNode;
		}else {
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}
		
	}

	public void appendAtStart(int d) {
		Node newNode = new Node(d);
		if (head == null) {
			head = newNode;
		} else {
			Node temp = head;
			head = newNode;
			head.next = temp;
		}
	}

	public void print() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
	}

	public void displayKtoLastElement(int d) {
		Node temp = head;
		while (temp != null) {
			
		}
	}

}
