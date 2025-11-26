package Assignment5_Q1;

public class BST {

    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int val) {
            data = val;
            left = right = null;
        }
    }

    private Node root;

    public BST() {
        root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void deleteAll() {
        root = null;
    }

    // ------------------ ADD NODE (FIXED) -------------------
    public void addNode(int val) {
        Node newNode = new Node(val);

        if (root == null) {
            root = newNode;
            return;
        }

        Node trav = root;

        while (true) {
            if (val < trav.data) {
                if (trav.left == null) {
                    trav.left = newNode;   // FIXED
                    break;
                }
                trav = trav.left;
            } 
            else {
                if (trav.right == null) {
                    trav.right = newNode;  // FIXED
                    break;
                }
                trav = trav.right;
            }
        }
    }

    // ------------------ RECURSIVE SEARCH -------------------
    public Node searchRec(Node root, int key) {
        if (root == null)
            return null;

        if (root.data == key)
            return root;

        if (key < root.data)
            return searchRec(root.left, key);

        return searchRec(root.right, key);
    }

    // Wrapper method to print result
    public void searchRec(int key) {
        Node res = searchRec(root, key);

        if (res != null)
            System.out.println("Found: " + res.data);
        else
            System.out.println("Not Found");
    }
    
   
    

   


    public static void main(String[] args) {
        BST B = new BST();
        B.addNode(10);
        B.addNode(20);
        B.addNode(15);

        B.searchRec(20);  // Output: Found: 20
        B.searchRec(7);   // Output: Not Found
    }
}
