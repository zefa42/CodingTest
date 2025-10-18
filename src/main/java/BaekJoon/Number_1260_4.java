package BaekJoon;

//정점의 개수 N(1 ≤ N ≤ 1,000), 간선의 개수 M(1 ≤ M ≤ 10,000), 탐색을 시작할 정점의 번호 V
//4 5 1
//1 2
//1 3
//1 4
//2 4
//3 4

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Number_1260_4 {
    static Map<Integer, List<Integer>> graph = new HashMap<>();
    static int N, M, V;
    static StringBuilder dfsResult = new StringBuilder();
    static StringBuilder bfsResult = new StringBuilder();

    public static void main(String[] args) throws IOException {

        Set<Integer> visited = new HashSet<>();


        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int[] input = Arrays.stream(bufferedReader.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        N = input[0];
        M = input[1];
        V = input[2];

        // 그래프 설정
        for(int i = 1; i <= N; ++i) {
            graph.put(i, new ArrayList<>());
        }
        for(int i = 0; i < M; ++i) {
            int[] values = Arrays.stream(bufferedReader.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            graph.get(values[0]).add(values[1]);
            graph.get(values[1]).add(values[0]);
        }

        for(int i = 1; i <= N; ++i) {
            Collections.sort(graph.get(i));
        }

        bfs(visited, V);
        visited = new HashSet<>();
        dfs(visited, V);
        System.out.println(dfsResult);
        System.out.println(bfsResult);
    }

    public static void dfs(Set<Integer> visited, int cur) {
        visited.add(cur);
        dfsResult.append(cur).append(" ");
        for(int next : graph.get(cur)) {
            if(!visited.contains(next)) {
                dfs(visited, next);
            }
        }
    }

    public static void bfs(Set<Integer> visited, int cur) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(cur);
        visited.add(cur);

        while(!queue.isEmpty()) {
            int curNode = queue.poll();
            bfsResult.append(curNode).append(" ");
            for(int next : graph.get(curNode)) {
                if(!visited.contains(next)) {
                    visited.add(next);
                    queue.add(next);
                }
            }
        }
    }
}
