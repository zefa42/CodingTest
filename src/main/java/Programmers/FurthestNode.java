package Programmers;

import java.util.*;

public class FurthestNode {
    List<List<Integer>> nodes = new ArrayList<>();

    public int solution(int n, int[][] edge) {
        for(int i = 0; i <= n; ++i) {
            nodes.add(new ArrayList<>());
        }

        for(int[] e : edge) {
            nodes.get(e[0]).add(e[1]);
            nodes.get(e[1]).add(e[0]);
        }

        int[] dist = new int[n + 1];
        Queue<Integer> queue = new ArrayDeque<>();
        queue.offer(1);
        dist[1] = 1;

        while(!queue.isEmpty()) {
            int cur = queue.poll();
            for(int adj : nodes.get(cur)) {
                if(dist[adj] == 0) {
                    dist[adj] = dist[cur] + 1;
                    queue.add(adj);
                }
            }
        }

        int max = 0;
        int count = 0;
        for(int i = 2; i <= n; ++i) {
            if(dist[i] > max) {
                max = dist[i];
                count = 1;
            }
            else if(dist[i] == max) {
                count++;
            }
        }
        return count;
    }
}
