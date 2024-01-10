package BST;

import java.util.LinkedList;
import java.util.Queue;

public class BST {
    TreeNode root;

    BST() {
        this.root = null;
    }

    public void insert(int val) {
        TreeNode newTreeNode = new TreeNode(val);
        if (this.root == null) {
            this.root = newTreeNode;
            return;
        }

        TreeNode current = root;
        while (true) {
            if (current.val == val)
                return;

            if (current.val > val) {
                if (current.left == null) {
                    current.left = newTreeNode;
                    return;
                } else
                    current = current.left;
            } else {
                if (current.right == null) {
                    current.right = newTreeNode;
                    return;
                } else
                    current = current.right;
            }
        }

    }

    public TreeNode find(int val) {
        TreeNode current = this.root;

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

    public void BFS() {
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(this.root);

        while (q.size() != 0) {
            TreeNode current = q.poll();
            System.out.println(current.val);
            if (current.left != null)
                q.offer(current.left);
            if (current.right != null)
                q.offer(current.right);
        }
    }

    // in-order dfs
    public void recursiveDFS(TreeNode root) {
        if (this.root == null)
            return;

        TreeNode current = root;

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
