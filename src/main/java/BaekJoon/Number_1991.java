package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Number_1991 {
    static StringBuilder preOrder = new StringBuilder();
    static StringBuilder inOrder = new StringBuilder();
    static StringBuilder postOrder = new StringBuilder();
    static Map<Character, Node> map = new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(bufferedReader.readLine());
        for (int i = 0; i < count; ++i) {
            String[] input = bufferedReader.readLine().split(" ");
            char p = input[0].charAt(0);
            char l = input[1].charAt(0);
            char r = input[2].charAt(0);

            //computeIfAbsent
            //키가 없으면 새로 만들고, 있으면 기존 값 사용
            Node parent = map.computeIfAbsent(p, Node::new);
            if (l != '.') {
                parent.left = map.computeIfAbsent(l, Node::new);
            }
            if (r != '.') {
                parent.right = map.computeIfAbsent(r, Node::new);
            }
        }

        Node root = map.get('A');

        traverse(root);

        System.out.println(preOrder);
        System.out.println(inOrder);
        System.out.println(postOrder);
    }


    private static void traverse(Node node) {
        if (node == null)
            return;

        //전위
        preOrder.append(node.value);
        traverse(node.left);

        //중위
        inOrder.append(node.value);
        traverse(node.right);

        //후위
        postOrder.append(node.value);
    }

    static class Node {
        char value;
        Node left;
        Node right;

        public Node(char value) {
            this.value = value;
        }
    }
}