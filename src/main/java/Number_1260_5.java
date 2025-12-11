import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class Number_1260_5 {
    static StringBuilder bfsResult = new StringBuilder();
    static StringBuilder dfsResult = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int[] input = Arrays.stream(bufferedReader.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int N = input[0];
        int M = input[1];
        int V = input[2];

        Map<Integer, List<Integer>> graph = new HashMap<>();
        for(int i = 1; i <= N; ++i) {
            graph.put(i, new ArrayList<>());
        }

        for(int i = 0; i < M; ++i) {
            int[] node = Arrays.stream(bufferedReader.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            graph.get(node[0]).add(node[1]);
            graph.get(node[1]).add(node[0]);
        }

        for(int i = 1; i <= N; ++i) {
            Collections.sort(graph.get(i));
        }

        Set<Integer> visited = new HashSet<>();

        dfs(graph, visited, V);
        visited = new HashSet<>();
        bfs(graph, visited, V);

        System.out.println(dfsResult);
        System.out.println(bfsResult);
    }

    public static void bfs(Map<Integer, List<Integer>> graph, Set<Integer> visited, int V) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(V);
        visited.add(V);
        bfsResult.append(V).append(" ");

        while(!queue.isEmpty()) {
            int cur = queue.poll();
            for(int next : graph.get(cur)) {
                if(!visited.contains(next)) {
                    queue.offer(next);
                    visited.add(next);
                    bfsResult.append(next).append(" ");
                }
            }
        }
    }

    public static void dfs(Map<Integer, List<Integer>> graph, Set<Integer> visited, int cur) {
        visited.add(cur);
        dfsResult.append(cur).append(" ");
        for(int next : graph.get(cur)) {
            if(!visited.contains(next)) {
                dfs(graph, visited, next);
            }
        }
    }
}
