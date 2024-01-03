package BST;

public class BST {
    Node root;

    BST() {
        this.root = null;
    }

    public void insert(int val) {
        if (this.root == null) {
            this.root = new Node(val);
            return;
        }

        Node current = root;
        while (true) {
            if (current.val == val)
                return;

            if (current.val > val) {
                if (current.left == null) {
                    current.left = current;
                    return;
                } else
                    current = current.left;
            } else {
                if (current.right == null) {
                    current.right = current;
                    return;
                } else
                    current = current.right;
            }
        }

    }

}
