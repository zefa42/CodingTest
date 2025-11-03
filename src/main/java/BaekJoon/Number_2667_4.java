package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Number_2667_4{
    static int[] dr = {0, 0, 1, -1};
    static int[] dc = {1, -1, 0, 0};
    static List<Integer> result = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(bufferedReader.readLine());
        int[][] grid = new int[size][size];
        boolean[][] visited = new boolean[size][size];

        for(int i = 0; i < size; ++i) {
            int[] input = Arrays.stream(bufferedReader.readLine().split(""))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            for(int j = 0; j < size; ++j){
                grid[i][j] = input[j];
            }
        }

        for(int i = 0; i < size; ++i) {
            for(int j = 0; j < size; ++j) {
                if(!visited[i][j] && grid[i][j] == 1) {
                    int cnt = bfs(size, grid, visited, i, j);
                    result.add(cnt);
                }
            }
        }
        Collections.sort(result);
        System.out.println(result.size());
        for(int count : result) {
            System.out.println(count);
        }
    }

    public static int bfs(int size, int[][] grid, boolean[][] visited, int x, int y) {
        int count = 1;
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] {x, y});
        visited[x][y] = true;

        while(!queue.isEmpty()) {
            int[] cur = queue.poll();
            int curX = cur[0];
            int curY = cur[1];

            for(int i = 0; i < 4; ++i) {
                int nextX = curX + dr[i];
                int nextY = curY + dc[i];
                if(nextX >= 0 && nextX < size && nextY >= 0 && nextY < size && !visited[nextX][nextY] && grid[nextX][nextY] == 1) {
                    queue.offer(new int[] {nextX, nextY});
                    visited[nextX][nextY] = true;
                    count++;
                }
            }
        }
        return count;
    }
}
