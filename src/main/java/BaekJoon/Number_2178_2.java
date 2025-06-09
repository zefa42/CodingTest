package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Number_2178_2 {
    static int[] dr = {1, -1, 0, 0};
    static int[] dc = {0, 0, 1, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int[] inputSize = Arrays.stream(bufferedReader.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int N = inputSize[0];
        int M = inputSize[1];

        int[][] grid = new int[N][M];
        for(int i = 0; i < N; ++i) {
            int[] row = Arrays.stream(bufferedReader.readLine().split(""))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            for(int j = 0; j < M; ++j) {
                grid[i][j] = row[j];
            }
        }

        int[][] dist = new int[N][M];
        dist[0][0] = 1;

        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] {0, 0});

        while(!queue.isEmpty()) {
            int[] cur = queue.poll();
            int curX = cur[0];
            int curY = cur[1];

            for(int i = 0; i < 4; ++i) {
                int nextX = curX + dr[i];
                int nextY = curY + dc[i];
                if(nextX >= 0 && nextX < N && nextY >= 0 && nextY < M
                && grid[nextX][nextY] == 1 && dist[nextX][nextY] == 0) {
                    queue.offer(new int[] {nextX, nextY});
                    dist[nextX][nextY] = dist[curX][curY] + 1;
                }
            }
        }
        System.out.println(dist[N - 1][M - 1]);
    }
}
