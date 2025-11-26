package Q1;

public class Tester {
	public static void main(String []args) {
		List l=new List();
		
		l.insertAfterGivenNode(1, 1);
		//l.insertBeforeGivenNode(1, 1);
		l.insertAfterGivenNode(1, 2);
		l.insertAfterGivenNode(2, 3);
		
		l.insertBeforeGivenNode(1, 9);
		l.insertBeforeGivenNode(9, 8);
		l.insertBeforeGivenNode(78, 7);
		l.display();
	}
}
