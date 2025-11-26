package Question2;

public class CircularQueue {
	private int[] arr;
	private int rear;
	private int front;
	private int size;
	private int counter;
	
	public CircularQueue(int size) {
		this.size = size;
		arr = new int[size];
		rear = front = -1;
		counter = 0;
	}
	
	
	
	public void push(int val) {
		if(isFull()) {
			System.out.println("Queue is Full");
		}
		
		else {
			rear = (rear + 1) % size;
			arr[rear] = val;
			counter++;
		}
	}
	
	public int pop() {
		int temp = -1;
		if(isEmpty()) {
			System.out.println("Queue is Empty");
			
		}
		
		else {
			front = (front + 1)%size;
			temp = arr[front];
			
			counter--;
		}
		
		return temp;
	}
	
	public int peek() {
		int temp = -1;
		if(isEmpty()) System.out.println("Queue is Empty");
		
		else {
			temp = arr[(front + 1) % size];
		}
		
		return temp;
	}
	
	
	public boolean isFull() {
		if(counter == size) return true;
		return false;
	}
	
	public boolean isEmpty() {
		if(counter == 0) return true;
		return false;
	}
	
}





