package Q3;


public class List {
	static class Node{
		private int data;
		private Node next;
		
		public Node(int val) {
			data = val;
			next = null;
		}
	}

	private Node tail;
	
	public List() {
		tail = null;
	}
	
	public boolean isEmpty() {
		return tail == null;
	}
	
	public void addFirst(int val) {
		Node newNode = new Node(val);
		if(tail == null) {
			tail = newNode;
			tail.next = newNode;
		}
		
		else {
			newNode.next = tail.next;
			tail.next = newNode;
		}
		
	}
	
	public void addLast(int val) {
		Node newNode = new Node(val);
		
		if(tail == null) {
			tail = newNode;
			tail.next = newNode;
		}
		
		else {
			newNode.next = tail.next;
			tail.next = newNode;
			tail = newNode;
		}
	}
	
	
	public void deleteFirst() {
		if(tail == null) {
			System.out.println("List is Empty !");
		}
		
		else if(tail.next == tail) {
			tail = null;
		}
		
		else {
			tail.next = tail.next.next;
		}
	}
	
	public void deleteLast() {
		if(tail == null) {
			System.out.println("List is Empty !");
		}
		
		else if(tail.next == tail) {
			tail = null;
		}
		
		else {
			Node currNode = tail.next;
			do {
				currNode = currNode.next;
			} while(currNode.next != tail);
			
			currNode.next = tail.next;
			tail = currNode;
		}
	}
	
	
	public void displayList() {
		if(tail == null) {
			System.out.println("List is Empty !");
		}
		
		else if(tail.next == tail) {
			System.out.print(tail.data);
		}
		
		else {
			Node currNode = tail.next;
			
			do {
				System.out.print(" " + currNode.data);
				currNode = currNode.next;
			} while(currNode != tail.next);
			
			System.out.println("");
		}
	}
}


















