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

    public void insert(int index, int val) {
        if (index < 0 || index > this.length)
            return;

        if (index == 0)
            this.unshift(val);
        else if (index == this.length) {
            this.push(val);
        } else {

            Node newNode = new Node(val);

            Node current = this.get(index - 1);

            Node nextNode = current.next;

            current.next = newNode;
            newNode.next = nextNode;
            this.length++;
        }
    }

    public int remove(int index) {
        if (index < 0 || index >= this.length)
            return -1;

        if (index == 0)
            return this.shift();
        else if (index == this.length - 1)
            return this.pop();
        else {
            Node prevNode = this.get(index - 1);
            Node removingNode = prevNode.next;
            Node nextNode = removingNode.next;

            prevNode.next = nextNode;
            removingNode.next = null;

            this.length--;
            return removingNode.val;
        }
    }

    public void reverse() {
        Node prev = null;
        Node current = this.head;

        while (current != null) {
            Node later = current.next;

            current.next = prev;

            prev = current;
            current = later;
        }

        this.head = prev;

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
