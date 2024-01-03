package BST;

public class Runner {
    public static void main(String[] args) {
        BST tree = new BST();

        tree.insert(10);
        tree.insert(6);
        tree.insert(15);
        tree.insert(20);
        tree.insert(3);
        tree.insert(8);

        tree.DFS();
    }
}
