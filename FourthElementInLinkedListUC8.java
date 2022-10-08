package com.LinkedList;

public class FourthElementInLinkedListUC8 {

	Node head;

	static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	public static FourthElementInLinkedListUC8 insert(FourthElementInLinkedListUC8 list, int data) {
		Node new_node = new Node(data);
		if (list.head == null) {
			list.head = new_node;
		} else {
			Node last = list.head;
			while (last.next != null) {
				last = last.next;
			}
			last.next = new_node;
		}
		return list;
	}

	public static void printList(FourthElementInLinkedListUC8 list) {
		Node currNode = list.head;

		System.out.print("LinkedList: ");

		while (currNode != null) {
			System.out.print("key = " + currNode.data + ", ");
			currNode = currNode.next;
		}
	}

	public static FourthElementInLinkedListUC8 deleteByKey(FourthElementInLinkedListUC8 list, int key) {
		Node currNode = list.head, prev = null;
		if (currNode != null && currNode.data == key) {
			list.head = currNode.next;
			System.out.println(key + " found and deleted");
			return list;
		}
		while (currNode != null && currNode.data != key) {
			prev = currNode;
			currNode = currNode.next;
		}
		if (currNode != null) {
			prev.next = currNode.next;
			System.out.println(key + " found and deleted");
		}
		if (currNode == null) {
			System.out.println(key + " not found");
		}
		return list;
	}

	public int search(FourthElementInLinkedListUC8 list, int data) {
		if (head == null) {
			return -1;
		}
		int index = 0;
		Node temp = head;
		while (temp != null) {
			if (temp.data == data) {
				return index;
			}
			index++;
			temp = temp.next;
		}
		return -1;
	}

	public static void main(String[] args) {
		FourthElementInLinkedListUC8 list = new FourthElementInLinkedListUC8();
		list = insert(list, 56);
		list = insert(list, 30);
		list = insert(list, 40);
		list = insert(list, 70);
		printList(list);

	}
}
