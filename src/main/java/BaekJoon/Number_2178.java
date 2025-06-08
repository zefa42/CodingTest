package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Number_2178 {
    static int[] dr = {1, 0, -1, 0};
    static int[] dc = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int[] size = Arrays.stream(bufferedReader.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int N = size[0];
        int M = size[1];

        int[][] grid = new int[N + 1][M + 1];
        for(int i = 1; i <= N; ++i) {
            int[] input = Arrays.stream(bufferedReader.readLine().split(""))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            for(int j = 1; j <= M; ++j) {
                grid[i][j] = input[j - 1];
            }
        }

        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{1, 1});

        int[][] dist = new int[N + 1][M + 1];
        dist[1][1] = 1;

        while(!queue.isEmpty()) {
            int[] cur = queue.poll();
            int curX = cur[0];
            int curY = cur[1];

            if(curX == N && curY == M) {
                System.out.println(dist[N][M]);
                return;
            }

            for(int i = 0; i < 4; ++i) {
                int nextX = curX + dr[i];
                int nextY = curY + dc[i];
                if(nextX >= 1 && nextX <= N && nextY >= 1 && nextY <= M
                && grid[nextX][nextY] == 1 && dist[nextX][nextY] == 0) {
                    queue.offer(new int[]{nextX, nextY});
                    dist[nextX][nextY] = dist[curX][curY] + 1;
                }
            }
        }

    }

}
