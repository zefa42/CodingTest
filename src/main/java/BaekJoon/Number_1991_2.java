package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Number_1991_2 {
    // 전위증가
    static StringBuilder preOrder = new StringBuilder();
    // 중위증가
    static StringBuilder inOrder = new StringBuilder();
    // 후위증가
    static StringBuilder postOrder = new StringBuilder();
    // 키: 알파벳, 값: 알파벳, 좌측 노드, 우측 노드로 이루어진 맵
    static Map<Character, Node> map = new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(bufferedReader.readLine());
        for (int i = 0; i < count; ++i) {
            String[] input = bufferedReader.readLine().split(" ");

            // 부모 노드
            char p = input[0].charAt(0);
            // 좌측 노드
            char l = input[1].charAt(0);
            // 우측 노드
            char r = input[2].charAt(0);

            // computeIfAbsent() 함수로 대체 가능
            Node parent = map.get(p);
            if (parent == null) {          // 부모 노드가 아직 없으면
                parent = new Node(p);      // 새로 만들고
                map.put(p, parent);        // 맵에 저장
            }

            if (l != '.') {                // 왼쪽 자식 문자가 존재할 때
                Node leftChild = map.get(l);
                if (leftChild == null) {   // 노드가 없으면 생성-저장
                    leftChild = new Node(l);
                    map.put(l, leftChild);
                }
                parent.left = leftChild;   // 링크 연결
            }

            if (r != '.') {                // 오른쪽 자식 처리
                Node rightChild = map.get(r);
                if (rightChild == null) {
                    rightChild = new Node(r);
                    map.put(r, rightChild);
                }
                parent.right = rightChild;
            }

            //computeIfAbsent
            //키가 없으면 새로 만들고, 있으면 기존 값 사용
//            Node parent = map.computeIfAbsent(p, Node::new);
//            if (l != '.') {
//                parent.left = map.computeIfAbsent(l, Node::new);
//            }
//            if (r != '.') {
//                parent.right = map.computeIfAbsent(r, Node::new);
//            }
        }

        Node root = map.get('A');

        preOrder(root);
        inOrder(root);
        postOrder(root);

        System.out.println(preOrder);
        System.out.println(inOrder);
        System.out.println(postOrder);
    }

    private static void preOrder(Node node) {
        if(node == null) return;
        preOrder.append(node.value);
        preOrder(node.left);
        preOrder(node.right);
    }

    private static void inOrder(Node node) {
        if(node == null) return;
        inOrder(node.left);
        inOrder.append(node.value);
        inOrder(node.right);
    }

    private static void postOrder(Node node) {
        if(node == null) return;
        postOrder(node.left);
        postOrder(node.right);
        postOrder.append(node.value);
    }

//    private static void traverse(Node node) {
//        if (node == null)
//            return;
//
//        //전위
//        preOrder.append(node.value);
//        traverse(node.left);
//
//        //중위
//        inOrder.append(node.value);
//        traverse(node.right);
//
//        //후위
//        postOrder.append(node.value);
//    }

    static class Node {
        //트리가 한 번 만들어지고 나면 순회·출력은 Node 객체만으로 진행되므로,
        // 노드 스스로 어떤 글자인지 알고 있어야 불필요한 맵 조회를 피할 수 있습니다.
        char value;

        Node left;
        Node right;

        public Node(char value) {
            this.value = value;
        }
    }
}