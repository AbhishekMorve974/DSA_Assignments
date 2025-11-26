package Q2;

public class List {
	static class Node{
		private int data;
		private Node next;
		
		public Node(int value) {
			data=value;
			next=null;
		}
	}
	private Node head;
	public List() {
		head=null;
	}
	public void insertInSortedOrder(int value) {
	    Node newNode = new Node(value);

	    if (head == null || value < head.data) {
	        newNode.next = head;
	        head = newNode;
	        return;
	    }

	    Node curr = head;

	    while (curr.next != null && curr.next.data < value) {
	        curr = curr.next;
	    }

	    newNode.next = curr.next;
	    curr.next = newNode;
	}
	public void display() {
	    if (head == null) {
	        System.out.println("List is empty.");
	        return;
	    }

	    Node curr = head;
	    System.out.print("List: ");

	    while (curr != null) {
	        System.out.print(curr.data + " ");
	        curr = curr.next;
	    }

	    System.out.println(); 
	}

}
