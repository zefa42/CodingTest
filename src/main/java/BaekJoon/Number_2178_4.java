package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Number_2178_4 {
    static int[] dr = {0, 1, -1, 0};
    static int[] dc = {1, 0, 0, -1};

    static int rowLength;
    static int colLength;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int[] input = Arrays.stream(bufferedReader.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        rowLength = input[0];
        colLength = input[1];

        int[][] grid = new int[rowLength][colLength];
        for(int i = 0; i < rowLength; ++i) {
            int[] row = Arrays.stream(bufferedReader.readLine().split(""))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            for(int j = 0; j < colLength; ++j) {
                grid[i][j] = row[j];
            }
        }

        int[][] dist = new int[rowLength][colLength];
        dist[0][0] = 1;

        bfs(grid, dist);

        System.out.println(dist[rowLength - 1][colLength - 1]);
    }

    public static void bfs(int[][] grid, int[][] dist) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] {0, 0});
        while(!queue.isEmpty()) {
            int[] cur = queue.poll();
            int curR = cur[0];
            int curC = cur[1];

            for(int i = 0; i < 4; ++i) {
                int nextR = curR + dr[i];
                int nextC = curC + dc[i];
                if(nextR >= 0 && nextR < rowLength && nextC >= 0 && nextC < colLength && grid[nextR][nextC] == 1 && dist[nextR][nextC] == 0) {
                    queue.offer(new int[] {nextR, nextC});
                    dist[nextR][nextC] = dist[curR][curC] + 1;
                }
            }
        }
    }
}
