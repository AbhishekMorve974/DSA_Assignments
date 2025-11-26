package Question3;

public class QueueUsingLinkedList {
	static class Node{
		private int data;
		private Node next;
		
		public Node(int value) {
			data = value;
			next = null;
		}
	}
	
	private Node head, tail;
	public QueueUsingLinkedList() {
		head = tail = null;
	}
	
	public void push(int val) {
		Node newNode = new Node(val);
		if(head == null) {
			head = tail = newNode;
		}
		
		else {
			tail.next = newNode;
			tail = newNode;
		}
	}
	
	public int pop() {
		int temp = -1;
		
		if(isEmpty())
			System.out.println("Queue is empty");
		
		else {
			temp = head.data;
			if(head == tail) {
				head = tail = null;
			}
			
			else {
				head = head.next;
			}
		}
		
		return temp;
	}
	
	public int peek() {
		int temp = -1;
		if(isEmpty())
			System.out.println("Queue is empty");
		else {
			//a. read data from front end
			temp = head.data;
		}
		return temp;
	}
	
	public boolean isEmpty() {
		return head == null;
	}
}




