package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Number_2178_3 {
    static int[] dr = {0, 0, 1, -1};
    static int[] dc = {1, -1, 0, 0};

    static int rowLength;
    static int colLength;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int[] size = Arrays.stream(bufferedReader.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        rowLength = size[0];
        colLength = size[1];
        int[][] grid = new int[rowLength][colLength];
        for(int r = 0; r < rowLength; ++r) {
            int[] input = Arrays.stream(bufferedReader.readLine().split(""))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            for(int c = 0; c < colLength; ++c) {
                grid[r][c] = input[c];
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
            int curX = cur[0];
            int curY = cur[1];

            for(int i = 0; i < 4; ++i) {
                int nextX = curX + dr[i];
                int nextY = curY + dc[i];
                if(nextX >= 0 && nextX < rowLength && nextY >= 0 && nextY < colLength
                && grid[nextX][nextY] == 1 && dist[nextX][nextY] == 0) {
                    queue.offer(new int[] {nextX, nextY});
                    dist[nextX][nextY] = dist[curX][curY] + 1;
                }
            }
        }
    }
}
