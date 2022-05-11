package com.datastructure;

public class Node {
	Node next;
	int data;

	public Node head = null;

	public Node(int data) {
		this.data = data;
		this.next = null;
		head = this;
	}

	public void appendToEnd(int d) {
		Node newNode = new Node(d);
		Node temp = head;
		if (head == null) {
			head = newNode;
		} else {
			while (temp.next != null) {
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

	public int deleteFromFront() {
		int data = 0;
		if (head == null) {
			System.out.println("Given queue is Empty");
			return -1;
		} else {
			data = head.data;
			head = head.next;
		}
		return data;
	}

	public void displayKtoLastElement(int d) {
		Node temp = head;
		while (temp != null) {

		}
	}

}
