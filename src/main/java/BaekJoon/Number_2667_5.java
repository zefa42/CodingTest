package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class Number_2667_5 {
    static int size;
    static int[][] grid;
    static int[] dr = {0, 1, -1, 0};
    static int[] dc = {1, 0, 0, -1};
    static boolean[][] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        size = Integer.parseInt(bufferedReader.readLine());
        grid = new int[size][size];
        for(int i = 0; i < size; ++i) {
            int[] input = Arrays.stream(bufferedReader.readLine().split(""))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            for(int j = 0; j < size; ++j) {
                grid[i][j] = input[j];
            }
        }

        visited = new boolean[size][size];
        List<Integer> result = new ArrayList<>();

        for(int i = 0; i < size; ++i) {
            for(int j = 0; j < size; ++j) {
                if(grid[i][j] == 1 && !visited[i][j]) {
                    int count = bfs(i, j);
                    if(count > 0) result.add(count);
                }
            }
        }
        Collections.sort(result);
        System.out.println(result.size());
        for(int c : result) {
            System.out.println(c);
        }
    }

    public static int bfs(int x, int y) {
        int count = 0;
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] {x, y});
        visited[x][y] = true;

        while(!queue.isEmpty()) {
            int[] cur = queue.poll();
            int curX = cur[0];
            int curY = cur[1];
            count++;

            for(int i = 0; i < 4; ++i) {
                int nextX = curX + dr[i];
                int nextY = curY + dc[i];
                if(nextX >= 0 && nextX < size && nextY >= 0 && nextY < size && grid[nextX][nextY] == 1 && !visited[nextX][nextY]) {
                    queue.offer(new int[] {nextX, nextY});
                    visited[nextX][nextY] = true;

                }
            }
        }
        return count;
    }
}
