package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Number_1303_2 {
    static int[] dr = {0, 0, 1, -1};
    static int[] dc = {1, -1, 0, 0};
    static int N;
    static int M;
    static char[][] grid;
    static boolean[][] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int[] size = Arrays.stream(bufferedReader.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        N = size[1];
        M = size[0];

        grid = new char[N][M];
        visited = new boolean[N][M];
        for(int r = 0; r < N; ++r) {
            String row = bufferedReader.readLine();
            for(int c = 0; c < M; ++c) {
                grid[r][c] = row.charAt(c);
            }
        }

        int w = 0;
        int b = 0;
        for(int r = 0; r < N; ++r) {
            for(int c = 0; c < M; ++c) {
                if(!visited[r][c]) {
                    int count = bfs(r, c, grid[r][c]);
                    if(grid[r][c] == 'W') {
                        w += count * count;
                    }
                    else {
                        b += count * count;
                    }
                }
            }

        }
        System.out.println(w + " " + b);
    }
    static int bfs(int x, int y, char color) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{x, y});

        int count = 1;

        while(!queue.isEmpty()) {
            int[] cur = queue.poll();
            int curX = cur[0];
            int curY = cur[1];
            visited[curX][curY] = true;

            for(int i = 0; i < 4; ++i) {
                int nextX = curX + dr[i];
                int nextY = curY + dc[i];
                if(nextX >= 0 && nextX < N && nextY >= 0 && nextY < M
                        && !visited[nextX][nextY] && grid[nextX][nextY] == color) {
                    queue.offer(new int[] {nextX, nextY});
                    visited[nextX][nextY] = true;
                    count++;
                }
            }
        }
        return count;
    }
}
