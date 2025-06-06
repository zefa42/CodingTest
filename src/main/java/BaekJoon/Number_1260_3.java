package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Number_1260_3 {
    static StringBuilder dfsOrder = new StringBuilder();
    static StringBuilder bfsOrder = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int[] input = Arrays.stream(bufferedReader.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int edgeCount = input[0];
        int lineCount = input[1];
        int startPoint = input[2];

        //노드 저장
        Map<Integer, List<Integer>> graph = new HashMap<>();
        Set<Integer> visited = new HashSet<>();

        for(int i = 1; i <= edgeCount; ++i) {
            graph.put(i, new ArrayList<>());
        }

        for(int i = 0; i < lineCount; ++i) {
            int[] line = Arrays.stream(bufferedReader.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            graph.get(line[0]).add(line[1]);
            graph.get(line[1]).add(line[0]);
        }

        for(int i = 1; i <= edgeCount; ++i) {
            Collections.sort(graph.get(i));
        }

        dfs(graph, visited, startPoint);
        visited = new HashSet<>();
        bfs(graph, visited, startPoint);
        System.out.println(dfsOrder);
        System.out.println(bfsOrder);
    }

    public static void dfs(Map<Integer, List<Integer>> graph, Set<Integer> visited, int cur) {
        visited.add(cur);
        dfsOrder.append(cur).append(" ");
        for(int next : graph.get(cur)) {
            if(!visited.contains(next)) {
                dfs(graph, visited, next);
            }
        }
    }

    public static void bfs(Map<Integer, List<Integer>> graph, Set<Integer> visited, int cur) {
        visited.add(cur);
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(cur);


        while(!queue.isEmpty()) {
            int next1 = queue.poll();
            bfsOrder.append(next1).append(" ");
            for(int next : graph.get(next1)) {
                if(!visited.contains(next)) {
                    visited.add(next);
                    queue.offer(next);
                }
            }
        }
    }
}
