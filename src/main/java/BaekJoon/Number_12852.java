package BaekJoon;
import java.io.*;
import java.util.*;

public class Number_12852 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] dist = new int[N + 1];
        int[] prev = new int[N + 1];
        Arrays.fill(dist, -1);

        Queue<Integer> q = new LinkedList<>();
        q.add(N);
        dist[N] = 0;
        prev[N] = -1;

        while (!q.isEmpty()) {
            int cur = q.poll();
            if (cur == 1) break;

            // 1 빼기
            if (cur - 1 >= 1 && dist[cur - 1] == -1) {
                dist[cur - 1] = dist[cur] + 1;
                prev[cur - 1] = cur;
                q.add(cur - 1);
            }

            // 2 나누기
            if (cur % 2 == 0 && dist[cur / 2] == -1) {
                dist[cur / 2] = dist[cur] + 1;
                prev[cur / 2] = cur;
                q.add(cur / 2);
            }

            // 3 나누기
            if (cur % 3 == 0 && dist[cur / 3] == -1) {
                dist[cur / 3] = dist[cur] + 1;
                prev[cur / 3] = cur;
                q.add(cur / 3);
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append(dist[1]).append("\n");

        List<Integer> path = new ArrayList<>();
        for (int cur = 1; cur != -1; cur = prev[cur]) {
            path.add(cur);
        }
        Collections.reverse(path);

        for (int x : path) sb.append(x).append(" ");

        System.out.println(sb.toString().trim());
    }
}
