package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Number_10026 {
    static int[] dr = {1, -1, 0, 0};
    static int[] dc = {0, 0, 1, -1};

    static int size;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        size = Integer.parseInt(bufferedReader.readLine());

        char[][] grid = new char[size][size];
        boolean[][] visited = new boolean[size][size];
        for(int i = 0; i < size; ++i) {
            String input = bufferedReader.readLine();
            for(int j = 0; j < size; ++j) {
                grid[i][j] = input.charAt(j);
            }
        }

        int normal = 0;
        for (int r = 0; r < size; ++r) {
            for (int c = 0; c < size; ++c) {
                if (!visited[r][c]) {
                    bfs(grid, visited, r, c, false);   // colorBlind = false
                    ++normal;
                }
            }
        }

        visited = new boolean[size][size];             // 새로 초기화
        int cb = 0;
        for (int r = 0; r < size; ++r) {
            for (int c = 0; c < size; ++c) {
                if (!visited[r][c]) {
                    bfs(grid, visited, r, c, true);    // colorBlind = true
                    ++cb;
                }
            }
        }

        String result = normal + " " + cb;
        System.out.println(result);
    }

    public static boolean same(char a, char b, boolean colorBlind) {
        if(a == b) return true;
        if(!colorBlind) return false;
        return (a != 'B' && b != 'B');
    }

    public static void bfs(char[][] grid, boolean[][] visited, int r, int c, boolean colorBlind) {
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
                if(nextX >= 0 && nextX < size && nextY >= 0 && nextY < size
                && same(grid[nextX][nextY], grid[curX][curY], colorBlind) && !visited[nextX][nextY]) {
                    queue.offer(new int[] {nextX, nextY});
                    visited[nextX][nextY] = true;
                }
            }
        }
    }
}
