package Question1;

import java.util.Scanner;

public class Tester {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string to Reverse: ");
		
		String s = scanner.next();
		
		int size = s.length();
		
		Stack st = new Stack(size);
		
		int i = 0;
		while(i < size) {
			st.push(s.charAt(i));
			i++;
		}
		
		String revString = "";
		
		while(!st.empty()) {
			revString += st.pop();
		}
		
		System.out.println("Reversed String is : " + revString);
		
	}
}
