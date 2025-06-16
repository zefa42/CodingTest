package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Number_2667_3 {
    static int[] dr = {0, 0, -1, 1};
    static int[] dc = {1, -1, 0, 0};
    static int size;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        size = Integer.parseInt(bufferedReader.readLine());
        int[][] grid = new int[size][size];
        boolean[][] visited = new boolean[size][size];

        List<Integer> result = new ArrayList<>();
        for(int r = 0; r < size; ++r) {
            int[] row = Arrays.stream(bufferedReader.readLine().split(""))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            for(int c = 0; c < size; ++c) {
                grid[r][c] = row[c];
            }
        }
        for(int r = 0; r < size; ++r) {
            for(int c = 0; c < size; ++c) {
                if(!visited[r][c] && grid[r][c] == 1) {
                    result.add(bfs(grid, visited, r, c));
                }
            }
        }
        Collections.sort(result);

        System.out.println(result.size());
        for(Integer number : result) {
            System.out.println(number);
        }
    }
    public static int bfs(int[][] grid, boolean[][] visited, int r, int c) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] {r, c});

        visited[r][c] = true;

        int count = 1;
        while(!queue.isEmpty()) {
            int[] cur = queue.poll();
            int curX = cur[0];
            int curY = cur[1];

            for(int i = 0; i < 4; ++i) {
                int nextX = curX + dr[i];
                int nextY = curY + dc[i];
                if(nextX >= 0 && nextX < size && nextY >= 0 && nextY < size
                && grid[nextX][nextY] == 1 && !visited[nextX][nextY]) {
                    queue.offer(new int[] {nextX, nextY});
                    visited[nextX][nextY] = true;
                    count++;
                }
            }
        }
        return count;
    }

}

