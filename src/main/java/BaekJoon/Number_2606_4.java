package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Number_2606_4 {
    static int count = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int nodeCount = Integer.parseInt(bufferedReader.readLine());
        int inputCount = Integer.parseInt(bufferedReader.readLine());

        Map<Integer, List<Integer>> graph = new HashMap<>();
        Set<Integer> visited = new HashSet<>();
        for(int i = 1; i <= nodeCount; ++i) {
            graph.put(i, new ArrayList<>());
        }

        for(int i = 0; i < inputCount; ++i) {
            int[] input = Arrays.stream(bufferedReader.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            int a = input[0];
            int b = input[1];
            graph.get(a).add(b);
            graph.get(b).add(a);
        }
        System.out.println(dfs(graph, visited, 1));
    }

    public static int dfs(Map<Integer, List<Integer>> graph, Set<Integer> visited, int cur) {
        visited.add(cur);
        for(int node : graph.get(cur)) {
            if(!visited.contains(node)) {
                dfs(graph, visited, node);
                count++;
            }
        }
        return count;
    }
}
