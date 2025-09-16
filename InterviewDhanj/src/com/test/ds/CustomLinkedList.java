package com.test.ds;



public class CustomLinkedList<T> {
	
	private Node<T> head;
	private int size;
	private static class Node<T> {
		T data;
		
		
		Node<T> next;
		
		Node(T data){
			this.data = data;
			this.next = null;
		}	
	}
	
	//@SuppressWarnings("null")
	public void add(T data) {
		
		//Node newNode = new Node(data);
		 Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
		} else {
			 Node currentNode = head;
			while(currentNode.next !=null) {
				currentNode = currentNode.next;				
			}
			currentNode.next = newNode;
		}
		size++;
	}
	
	public void remove(T data) {
		if(head == null) {
			return;    //List is empty
		}
		if(head.data.equals(data)) {
			head = head.next;
			size--;
			return;
		}
		
		Node cuNode = head;
		while(cuNode.next != null) {
			if(cuNode.next.data.equals(data)) {
				cuNode.next = cuNode.next.next;
				size--;
				return;
			}
			cuNode=cuNode.next;
		}
		
	}
	
	public void display() {
		
		Node<T> currentNode = head;
		while(currentNode!=null) {
			 System.out.print(currentNode.data + " ");
			 currentNode = currentNode.next;
		}
		
	}
	
	public int size() {
		return size;
		
	}
	
	public static void main(String args[]) {
		
		//LinkedList<E>
		
		CustomLinkedList<Integer> customLinkedList = new CustomLinkedList<Integer>();
		
		customLinkedList.add(10);
		customLinkedList.add(20);
		customLinkedList.add(30);		
		customLinkedList.display();
		
		customLinkedList.remove(20);
		
		System.out.println("Linked List:::"+customLinkedList.size());
		customLinkedList.display();
	}

}
