package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Number_4963 {
    static int width;
    static int height;

    static int[] dr = {1, 1, -1, -1, 1, 0, 0, -1};
    static int[] dc = {1, -1, 0, 1, 0, 1, -1, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();

        while(true) {
            String input = bufferedReader.readLine();
            if(input.equals("0 0")) {
                break;
            }

            int[] size = Arrays.stream(input.split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            width = size[0];
            height = size[1];

            int[][] grid = new int [height][width];
            for(int h = 0; h < height; ++h) {
                int[] row = Arrays.stream(bufferedReader.readLine().split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();
                for(int w = 0; w < width; ++w) {
                    grid[h][w] = row[w];
                }
            }

            boolean[][] visited = new boolean[height][width];

            int count = 0;
            for(int r = 0; r < height; ++r) {
                for(int c = 0; c < width; ++c) {
                    if(!visited[r][c] && grid[r][c] == 1) {
                        bfs(grid, visited, r, c);
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

            for(int i = 0; i < 8; ++i) {
                int nextX = curX + dr[i];
                int nextY = curY + dc[i];
                if(nextX >= 0 && nextX < height && nextY >= 0 && nextY < width
                && !visited[nextX][nextY] && grid[nextX][nextY] == 1) {
                    queue.offer(new int[] {nextX, nextY});
                    visited[nextX][nextY] = true;
                }
            }
        }
    }
}
