package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Number_2606_2 {
    static int count = 0;
    private static void dfs(List<List<Integer>> graph, Set<Integer> visited, int current) {
        visited.add(current);
        for(int adj : graph.get(current)) {
            if(!visited.contains(adj)) {
                count++;
                dfs(graph, visited, adj);
            }
        }
    }

    private static void solve(List<List<Integer>> graph, int current) {
        Set<Integer> visited = new HashSet<>();
        dfs(graph, visited, current);
    }

    public static void main(String[] args) throws IOException {
        List<List<Integer>> graph = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int computerCount = Integer.parseInt(bufferedReader.readLine());
        int line = Integer.parseInt(bufferedReader.readLine());
        for(int i = 0; i <= computerCount; ++i) {
            graph.add(new ArrayList<>());
        }
        for(int i = 0; i < line; ++i) {
            int[] input = Arrays.stream(bufferedReader.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            graph.get(input[0]).add(input[1]);
            graph.get(input[1]).add(input[0]);
        }
        solve(graph, 1);
        System.out.println(count);
    }
}
