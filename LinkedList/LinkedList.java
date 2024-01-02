package LinkedList;

public class LinkedList {
    Node head, tail;
    int length;

    LinkedList() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    public void push(int val) {
        Node newNode = new Node(val);

        if (this.head == null) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            this.tail.next = newNode;
            this.tail = newNode;
        }
        this.length++;
    }

    public int pop() {
        if (this.head == null)
            return -1;

        Node current = this.head;
        Node prev = this.head;

        if (this.length > 1) {
            while (current.next != null) {
                prev = current;
                current = current.next;
            }

            prev.next = null;
            this.tail = prev;
        } else {
            this.head = null;
            this.tail = null;
        }
        this.length--;

        return current.val;

    }

    public void unshift(int val) {
        Node newNode = new Node(val);

        if (this.head == null) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            newNode.next = this.head;
            this.head = newNode;
        }
        this.length++;
    }

    public int shift() {
        if (this.head == null)
            return -1;

        Node prevHead = this.head;

        if (this.length > 1) {
            Node newHead = prevHead.next;
            prevHead.next = null;
            this.head = newHead;
        } else {
            this.head = null;
            this.tail = null;
        }
        this.length--;
        return prevHead.val;
    }

    public Node get(int index) {
        if (this.length == 0 || index >= this.length)
            return new Node(-1);
        Node current = this.head;

        while (index != 0) {
            current = current.next;
            index--;
        }
        return current;
    }

    public void set(int index, int val) {
        Node foundNode = this.get(index);
        if (foundNode.val == -1)
            return;
        foundNode.val = val;
    }

    public void print() {
        if (this.length == 0) {
            System.out.print("[]");
            return;
        }

        Node current = this.head;

        System.out.print("[");
        while (current != null) {
            System.out.print(current.val + " , ");
            current = current.next;
        }
        System.out.print("]");

    }
}
