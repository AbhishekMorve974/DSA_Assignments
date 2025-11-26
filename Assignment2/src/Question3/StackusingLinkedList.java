package Question3;

public class StackusingLinkedList {
	static class Node{
		private int data;
		private Node next;
		
		public Node(int val) {
			data = val;
			next = null;
		}
	}
	
	private Node head;
	
	public StackusingLinkedList() {
		head = null;
	}
	
	public void push(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}
	
	public int pop() {
		int temp = -1;
		if(isEmpty()) {
			System.out.println("Stack is Empty");
		}
		
		else {
			temp = head.data;
			head = head.next;
		}
		
		return temp;
		
	}
	
	public int peek() {
		int temp = -1;
		if(isEmpty()) {
			System.out.println("Stack is Empty");
		}
		
		else {
			temp = head.data;
		}
		
		return temp;
	}
	
	public boolean isEmpty() {
		return head == null;
	}
}

