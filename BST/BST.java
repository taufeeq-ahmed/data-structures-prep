package BST;

import java.util.LinkedList;
import java.util.Queue;

public class BST {
    Node root;

    BST() {
        this.root = null;
    }

    public void insert(int val) {
        Node newNode = new Node(val);
        if (this.root == null) {
            this.root = newNode;
            return;
        }

        Node current = root;
        while (true) {
            if (current.val == val)
                return;

            if (current.val > val) {
                if (current.left == null) {
                    current.left = newNode;
                    return;
                } else
                    current = current.left;
            } else {
                if (current.right == null) {
                    current.right = newNode;
                    return;
                } else
                    current = current.right;
            }
        }

    }

    public Node find(int val) {
        Node current = this.root;

        while (current != null) {
            if (current.val == val) {
                return current;
            } else if (current.val < val) {
                current = current.right;
            } else {
                current = current.left;
            }
        }
        return null;
    }

    public void recursiveBFS(Queue<Node> q) {
        if (q.isEmpty()) {
            return;
        }

        Node current = q.poll();
        System.out.println(current.val);
        if (current.left != null) {
            q.offer(current.left);
        }
        if (current.right != null) {
            q.offer(current.right);
        }

        recursiveBFS(q);
    }

    public void BFS() {
        if (this.root == null)
            return;

        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        recursiveBFS(q);
    }

    // in-order dfs
    public void recursiveDFS(Node root) {
        if (this.root == null)
            return;

        Node current = root;

        if (current.left != null)
            recursiveDFS(current.left);

        System.out.println(current.val);

        if (current.right != null)
            recursiveDFS(current.right);
    }

    public void DFS() {
        if (this.root == null)
            return;

        recursiveDFS(root);
    }
}
