package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class Number_10282 {
    private static final int INF = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(bufferedReader.readLine());
        StringBuilder result = new StringBuilder();

        for(int i = 0; i < testCase; ++i) {
            int[] inputInfo = Arrays.stream(bufferedReader.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            int computerCount = inputInfo[0];
            int dependencyCount = inputInfo[1];
            int startComputer = inputInfo[2];

            // 그래프 저장(인접리스트)
            List<List<Edge>> graph = new ArrayList<>(computerCount + 1);
            for(int e = 0; e <= computerCount; ++e) {
                graph.add(new ArrayList<>());
            }

            // 의존성 입력 (from, to, cost)
            for(int j = 0; j < dependencyCount; ++j) {
                int[] inputDependency = Arrays.stream(bufferedReader.readLine().split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();
                int to = inputDependency[0];
                int from = inputDependency[1];
                int cost = inputDependency[2];

                // b가 감염되면 s초 뒤 a 감염
                graph.get(from).add(new Edge(to, cost));
            }

            // 다익스트라 시작
            int[] dist = new int[computerCount + 1];
            Arrays.fill(dist, INF);
            dist[startComputer] = 0;

            PriorityQueue<Node> pq = new PriorityQueue<>();
            pq.offer(new Node(startComputer, 0));

            while(!pq.isEmpty()) {
                Node cur = pq.poll();
                if(cur.dist > dist[cur.v]) {
                    continue;
                }

                for(Edge e : graph.get(cur.v)) {
                    int newDist  = cur.dist + e.cost;
                    if(newDist < dist[e.to]) {
                        dist[e.to] = newDist;
                        pq.offer(new Node(e.to, newDist));
                    }
                }
            }

            // 결과
            int infectedCount = 0;
            int maxTime = 0;
            for(int k = 0; k <= computerCount; ++k) {
                if(dist[k] != INF) {
                    infectedCount++;
                    if(dist[k] > maxTime) {
                        maxTime = dist[k];
                    }
                }
            }
            result.append(infectedCount).append(' ').append(maxTime).append('\n');
        }
        System.out.println(result);
    }

    // 1개 간선 표현 (다음 정점, 가중치)
    private static class Edge {
        int to;
        int cost;

        public Edge(int to, int cost) {
            this.to = to;
            this.cost = cost;
        }
    }

    // 다익스트라용 PriorityQueue 원소 (지금까지 소요 시간, 정점 번호)
    private static class Node implements Comparable<Node> {
        int v;
        int dist;

        public Node(int v, int dist) {
            this.v = v;
            this.dist = dist;
        }

        @Override
        public int compareTo(Node o) {
            return Integer.compare(this.dist, o.dist);
        }
    }
}
