package Recursion;

import BST.TreeNode;
import LinkedList.Node;

// Recursion is a little slow because of CPu overload and can cause stack overflows if poorly constructed.
public class Recursion {

    public int getLinkedListlength(Node head) {
        if (head.next == null)
            return 1;
        return 1 + getLinkedListlength(head.next);
    }

    public String getRevereString(String str) {
        if (str.length() == 1)
            return str;
        return getRevereString(str.substring(1)) + str.charAt(0);
    }

    public boolean isPalindrome(String str) {
        if (str.length() == 1)
            return true;
        if (str.charAt(0) == str.charAt(str.length() - 1))
            return isPalindrome(str.substring(1, str.length() - 1));
        else
            return false;
    }

    public int fib(int n) {
        if (n == 1 || n == 2)
            return 1;
        return fib(n - 1) + fib(n - 2);
    }

    public Node reverseLinkedListNode(Node head) {
        if (head.next == null)
            return head;
        Node later = reverseLinkedListNode(head.next);
        head.next.next = head;
        head.next = null;
        return later;
    }

    public Node mergeTwoSortedLinkedLists(Node a, Node b) {
        if (a == null)
            return b;
        if (b == null)
            return a;
        if (a.val < b.val) {
            a.next = mergeTwoSortedLinkedLists(a.next, b);
            return a;
        } else {
            b.next = mergeTwoSortedLinkedLists(a, b.next);
            return b;
        }
    }

    public void printLeafNodes(TreeNode root) {
        if (root.left == null && root.right == null) {
            System.out.println(root.val);
            return;
        }
        if (root.left != null)
            printLeafNodes(root.left);
        if (root.right != null)
            printLeafNodes(root.right);
    }
}
