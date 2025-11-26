package Q1;

public class List {

    static class Node {
        private int data;
        private Node next;

        public Node(int value) {
            data = value;
            next = null;
        }
    }

    private Node head;

    public List() {
        head = null;
    }

    
    public void insertAfterGivenNode(int nodeData, int value) {
        Node newNode = new Node(value);

        if (head == null) {
            head=newNode;
            return;
        }

        Node curr = head;

        // Search for the node
        while (curr != null && curr.data != nodeData) {
            curr = curr.next;
        }

        // If not found
        if (curr == null) {
            //System.out.println("Node with data " + nodeData + " not found!");
            return;
        }

        // Insert after
        newNode.next = curr.next;
        curr.next = newNode;
    }

    public void insertBeforeGivenNode(int nodeData, int value) {
        Node newNode = new Node(value);

        // If list empty
        if (head == null) {
            head=newNode;
            return;
        }

        // If inserting before head
        if (head.data == nodeData) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node curr = head;

        // Traverse until node.next is the target node
        while (curr.next != null && curr.next.data != nodeData) {
            curr = curr.next;
        }

        // If node not found
        if (curr.next == null) {
            System.out.println("Node with data " + nodeData + " not found!");
            return;
        }

        // Insert before
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
