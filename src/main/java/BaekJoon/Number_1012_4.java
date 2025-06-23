package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Number_1012_4 {
    static int rowLength;
    static int colLength;

    static int[] dr = {1, -1, 0, 0};
    static int[] dc = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        StringBuilder result = new StringBuilder();

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int testCount = Integer.parseInt(bufferedReader.readLine());
        while(testCount-- != 0) {
            int[] input = Arrays.stream(bufferedReader.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            rowLength = input[0];
            colLength = input[1];
            int wormCount = input[2];

            int[][] grid = new int[rowLength][colLength];
            for(int i = 0; i < wormCount; ++i) {
                int[] rawWorm = Arrays.stream(bufferedReader.readLine().split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();
                int wormX = rawWorm[0];
                int wormY = rawWorm[1];
                grid[wormX][wormY] = 1;
            }

            boolean[][] visited = new boolean[rowLength][colLength];

            int count = 0;
            for(int i = 0; i < rowLength; ++i) {
                for(int j = 0; j < colLength; ++j) {
                    if(!visited[i][j] && grid[i][j] == 1) {
                        bfs(grid, visited, i, j);
                        count++;
                    }
                }
            }
            result.append(count).append('\n');
        }
        System.out.println(result);
    }

    public static void bfs(int[][] grid, boolean[][] visited, int r, int c) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] {r, c});
        visited[r][c] = true;

        while(!queue.isEmpty()) {
            int[] cur = queue.poll();
            int curX = cur[0];
            int curY = cur[1];

            for(int i = 0; i < 4; ++i) {
                int nextX = curX + dr[i];
                int nextY = curY + dc[i];
                if(nextX >= 0 && nextX < rowLength && nextY >= 0 && nextY < colLength
                && !visited[nextX][nextY] && grid[nextX][nextY] == 1) {
                    queue.offer(new int[] {nextX, nextY});
                    visited[nextX][nextY] = true;
                }
            }
        }
    }
}
