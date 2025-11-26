package Q3;

public class Tester {
	public static void main(String[] args) {
		List l1 = new List();
		
		l1.addFirst(2);
		l1.addFirst(5);
		l1.addFirst(8);
		
		l1.addLast(9);
		
//		l1.deleteFirst();
		l1.deleteLast();
		
		l1.displayList();
	}
}
