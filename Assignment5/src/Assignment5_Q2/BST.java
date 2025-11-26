package Assignment5_Q2;



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

   
    
    public Node inorderSuccessor(Node root, int key) {
        if (root == null)
            return null;

    
        if (key < root.data) {
            Node left = inorderSuccessor(root.left, key);
            return (left != null) ? left : root;
        }

        else if (key > root.data) {
            return inorderSuccessor(root.right, key);
        }

      else {
            if (root.right != null)
                return findMin(root.right);
            return null;   
        }
    }
    

    private Node findMin(Node node) {
        if (node.left == null)
            return node;
        return findMin(node.left);  
    }
    public void inorderSuccessor(int key) {
        Node x=inorderSuccessor(root, key);
        System.out.print(x.data);
    }


    public static void main(String[] args) {
        BST B = new BST();
        B.addNode(10);
        B.addNode(20);
        B.addNode(15);

        B.inorderSuccessor(15);
    }
}
