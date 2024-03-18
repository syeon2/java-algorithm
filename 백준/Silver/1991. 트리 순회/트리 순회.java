import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashMap<Character, Node> map = new HashMap<>();

        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            char value = sc.next().charAt(0);
            char leftValue = sc.next().charAt(0);
            char rightValue = sc.next().charAt(0);

            Node node;
            if (map.containsKey(value)) {
                node = map.get(value);
            } else node = new Node(value);

            if (leftValue != '.') {
                Node left = new Node(leftValue);

                node.left = left;
                map.put(leftValue, left);
            }
            if (rightValue != '.') {
                Node right = new Node(rightValue);

                node.right = right;
                map.put(rightValue, right);
            }

            map.put(value, node);
        }

        Node firstNode = map.get('A');

        preorder(firstNode);
        System.out.println();
        inorder(firstNode);
        System.out.println();
        postorder(firstNode);
    }

    public static void preorder(Node node) {
        System.out.print(node.value);

        if (node.left != null) preorder(node.left);
        if (node.right != null) preorder(node.right);
    }

    public static void inorder(Node node) {
        if (node.left != null) inorder(node.left);
        System.out.print(node.value);
        if (node.right != null) inorder(node.right);
    }

    public static void postorder(Node node) {
        if (node.left != null) postorder(node.left);
        if (node.right != null) postorder(node.right);
        System.out.print(node.value);
    }

    static class Node {
        public char value;
        public Node left = null;
        public Node right = null;

        public Node(char value) {
            this.value = value;
        }
    }
}
