package LinkedList;

public class Runner {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.push(10);
        list.push(20);
        list.push(30);
        list.push(40);
        list.push(50);

        list.print();

        // System.out.println("remoed " + list.pop());
        // list.print();
        // System.out.println("remoed " + list.pop());
        // list.print();
        // System.out.println("remoed " + list.pop());
        // list.print();
        // System.out.println("remoed " + list.pop());
        // list.print();
        // System.out.println("remoed " + list.pop());
        // list.print();

        // list.unshift(10);
        // list.unshift(20);
        // list.unshift(30);
        // list.unshift(40);
        // list.unshift(50);

        // System.out.println(list.get(0).val);
        // System.out.println(list.get(3).val);
        // System.out.println(list.get(5).val);

        // System.out.println("remoed " + list.shift());
        // list.print();
        // System.out.println("remoed " + list.shift());
        // list.print();
        // System.out.println("remoed " + list.shift());
        // list.print();
        // System.out.println("remoed " + list.shift());
        // list.print();
        // System.out.println("remoed " + list.shift());
        // list.print();
        // System.out.println("remoed " + list.shift());
        // list.print();

        list.set(3, 99);
        list.set(0, 102);
        list.set(9, 102);
        list.print();

    }
}
