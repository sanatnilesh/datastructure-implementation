package com.datastructure;

import java.util.HashSet;
import java.util.LinkedList;

/**
 * remove duplicate from the given linkedlist.
 * 
 * @author Sanatkumar
 *
 */
public class LinkedListImplemenation {
	public static void main(String[] args) {
		LinkedList<Integer> linkedList = new LinkedList<>();
		linkedList.add(2);
		linkedList.add(1);
		linkedList.add(5);
		linkedList.add(4);
		linkedList.add(1);

		removeDuplicate(linkedList);
		
		//use Node class
		Node node = new Node(2);
		node.appendToEnd(3);
		node.appendToEnd(1);
		node.appendToEnd(5);
		node.appendToEnd(11);
		node.appendAtStart(0);
		node.appendAtStart(2);
		node.print();
	}

	private static void removeDuplicate(LinkedList<Integer> linkedList) {
		HashSet<Integer> hashSet = new HashSet<>();

		for (Integer integer : linkedList) {
			if (hashSet.contains(integer)) {
				linkedList.remove(integer);
			} else {
				hashSet.add(integer);
			}
		}
		System.out.println(hashSet);
	}
}
