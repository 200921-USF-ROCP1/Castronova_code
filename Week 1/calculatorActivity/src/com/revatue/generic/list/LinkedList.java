package com.revatue.generic.list;

public class LinkedList<T>{
	Node head;
	int size;
	
	public LinkedList() {
		size = 0;
		head = null;
	}
	
	//insert
	//Find the last element (next == null)
	//Create a new node and set as next
	//Increase size
	public void insert(T data) {
		Node node = head;
		
		//Find the last element
		while (node.next != null){
			node = node.next;
		}
		
		//Create the new node and set it as next
		Node newNode = new Node(data, null);
		node.next = newNode;
		
		//Increase size
		++size;
	}
	
	//get
	//if index >= size, return null
	//Iterate index - 1 times to find the data
	public T get(int index) {
		if (index >= size || index < 0) {
			throw new IndexOutOfBoundsException();
		}
		
		Node itr = head;
		
		for (int i = 0; i < index; i++) {
			itr = itr.next;
		}
		
		return itr.data;
	}
	
	public int getSize() {
		return size;
	}
	
	public Iterator getIterator() {
		return new Iterator();
	}
	
	class Node{
		T data;
		Node next;
		
		Node(T data, Node next){
			this.data = data;
			this.next = next;
		}
	}
	
	
	public class Iterator{
		Node current;
		
		public Iterator() {
			current = head;
		}
		
		public boolean hasNext() {
			return current == null;
		}
		
		public void next() {
			current = current.next;
		}
		
		public T getData() {
			return current.data;
		}
	}
}
