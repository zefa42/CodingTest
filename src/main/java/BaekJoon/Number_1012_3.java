package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Number_1012_3 {
    static int[] dr = {1, -1, 0, 0};
    static int[] dc = {0, 0, 1, -1};
    static int M;
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(bufferedReader.readLine());
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < testCase; ++i) {
            int[] input = Arrays.stream(bufferedReader.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            M = input[0];
            N = input[1];
            int K = input[2];

            int[][] grid = new int[M][N];
            for(int j = 0; j < K; ++j) {
                int[] wormPosition = Arrays.stream(bufferedReader.readLine().split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();
                int x = wormPosition[0];
                int y = wormPosition[1];
                grid[x][y] = 1;
            }

            boolean[][] visited = new boolean[M][N];

            int count = 0;
            for(int row = 0; row < M; ++row) {
                for(int col = 0; col < N; ++col) {
                    if(grid[row][col] == 1 && !visited[row][col]) {
                        bfs(grid, visited, row, col);
                        count++;
                    }
                }
            }
            result.append(count).append('\n');
        }
        System.out.println(result);
    }

    public static void bfs(int[][] grid, boolean[][] visited, int x, int y) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{x, y});
        visited[x][y] = true;
        while(!queue.isEmpty()) {
            int[] cur = queue.poll();
            int curX = cur[0];
            int curY = cur[1];

            for(int i = 0; i < 4; ++i) {
                int nextX = curX + dr[i];
                int nextY = curY + dc[i];
                if(nextX >= 0 && nextX < M && nextY >= 0 && nextY < N
                && grid[nextX][nextY] == 1 && !visited[nextX][nextY]) {
                    queue.offer(new int[] {nextX, nextY});
                    visited[nextX][nextY] = true;
                }
            }
        }
    }
}
