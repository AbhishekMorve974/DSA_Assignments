package Assignment5_Q3;


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

   
    
  

    public int getLevel(int key) {
        return getLevelRec(root, key, 0);
    }

    private int getLevelRec(Node node, int key, int level) {
        if (node == null)
            return 0;  

        if (node.data == key)
            return level;

        if (key < node.data)
            return getLevelRec(node.left, key, level + 1);
        else
            return getLevelRec(node.right, key, level + 1);
    }



    public static void main(String[] args) {
        BST B = new BST();
        B.addNode(10);
        B.addNode(20);
        B.addNode(15);

        int x=B.getLevel(15);
        System.out.print(x);
    }
}

