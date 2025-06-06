package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Number_2606_3 {
    static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int computerCount = Integer.parseInt(bufferedReader.readLine());
        int lineCount = Integer.parseInt(bufferedReader.readLine());
        Map<Integer, List<Integer>> graph = new HashMap<>();
        Set<Integer> visited = new HashSet<>();
        for(int i = 1; i <= computerCount; ++i) {
            graph.put(i, new ArrayList<>());
        }

        for(int i = 0; i < lineCount; ++i) {
            int[] input = Arrays.stream(bufferedReader.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            graph.get(input[0]).add(input[1]);
            graph.get(input[1]).add(input[0]);
        }
        System.out.println(dfs(graph, visited, 1));

    }

    public static int dfs(Map<Integer, List<Integer>> graph, Set<Integer> visited, int cur) {
        visited.add(cur);
        for(int next : graph.get(cur)) {
            if(!visited.contains(next)) {
                dfs(graph, visited, next);
                count++;
            }
        }
        return count;
    }
}
