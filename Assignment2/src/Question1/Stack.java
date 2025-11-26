package Question1;

public class Stack {
	private char arr[];
	private int top;
	private int SIZE;
	
	public Stack(int size) {
		SIZE = size;
		arr = new char[SIZE];
		top = -1;
	}
	
	public void push(char ch) {
		if(top == SIZE -1) {
			throw new RuntimeException("Stack Overflow!");
		}
		top++;
		arr[top] = ch;
	}
	
	public char pop() {
		if (top == -1) {
            throw new RuntimeException("Stack Underflow");
        }
		char temp = arr[top];
		top--;
		return temp;
	}
	
	public boolean empty() {
		if(top == -1) return true;
		return false;
	}
}














