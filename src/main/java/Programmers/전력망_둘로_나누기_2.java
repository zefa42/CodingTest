package Programmers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class 전력망_둘로_나누기_2 {
    static Map<Integer, List<Integer>> graph;
    static boolean[] visited;
    static int result;

    public int solution(int n, int[][] wires) {
        result = n;
        graph = new HashMap<>();
        visited = new boolean[n + 1];

        for(int i = 1; i <= n; ++i) {
            graph.put(i, new ArrayList<>());
        }
        for(int[] wire : wires) {
            graph.get(wire[0]).add(wire[1]);
            graph.get(wire[1]).add(wire[0]);
        }
        dfs(1, n);
        return result;
    }

    public int dfs(int cur, int n) {
        int count = 1;
        visited[cur] = true;

        for(int node : graph.get(cur)) {
            if(!visited[node]) {
                count += dfs(node, n);
            }
        }
        result = Math.min(result, Math.abs(n - count * 2));
        return count;
    }
}
