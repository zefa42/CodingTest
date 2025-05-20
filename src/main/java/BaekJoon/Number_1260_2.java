package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Number_1260_2 {
    static List<Integer> DFS_order = new ArrayList<>();
    static List<Integer> BFS_order = new ArrayList<>();

    private static void dfs(List<List<Integer>> graph, Set<Integer> visited, int current) {
        visited.add(current);
        for(int adj : graph.get(current)) {
            if(!visited.contains(adj)) {
                DFS_order.add(adj);
                dfs(graph, visited, adj);
            }
        }
    }

    private static void solveDFS(List<List<Integer>> graph, int current) {
        DFS_order.add(current);
        Set<Integer> visited = new HashSet<>();
        dfs(graph, visited, current);
    }

    private static void bfs(List<List<Integer>> graph, int current) {
        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new ArrayDeque<>();
        queue.offer(current);
        visited.add(current);
        while(!queue.isEmpty()) {
            int next = queue.poll();
            BFS_order.add(next);

            for(int e : graph.get(next)) {
                if(!visited.contains(e)) {
                    queue.offer(e);
                    visited.add(e);
                }
            }

        }
    }

    public static void main(String[] args) throws IOException {
        List<List<Integer>> graph = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int[] input = Arrays.stream(bufferedReader.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int nodeCount = input[0];
        int line = input[1];
        int startNode = input[2];

        for(int i = 0; i <= nodeCount; ++i) {
            graph.add(new ArrayList<>());
        }
        for(int i = 0; i < line; ++i) {
            int[] connection = Arrays.stream(bufferedReader.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            graph.get(connection[0]).add(connection[1]);
            graph.get(connection[1]).add(connection[0]);
        }

        for(List<Integer> e : graph) {
            Collections.sort(e);
        }

        StringBuilder result = new StringBuilder();

        solveDFS(graph, startNode);
        for(int n : DFS_order) {
            result.append(n).append(" ");
        }
        result.append('\n');
        bfs(graph, startNode);
        for(int n : BFS_order) {
            result.append(n).append(" ");
        }

        System.out.println(result);
    }
}
