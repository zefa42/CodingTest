package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Number_1303_4 {
    static int[] dr = {1, -1, 0, 0};
    static int[] dc = {0, 0, 1, -1};

    static int rowLength;
    static int colLength;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int[] size = Arrays.stream(bufferedReader.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        rowLength = size[0];
        colLength = size[1];

        char[][] grid = new char[rowLength][colLength];

        for(int i = 0; i < colLength; ++i) {
            String row = bufferedReader.readLine();
            for(int j = 0; j < rowLength; ++j) {
                grid[i][j] = row.charAt(j);
            }
        }

        boolean[][] visited = new boolean[rowLength][colLength];

        int wPower = 0;
        int bPower = 0;
        for(int i = 0; i < colLength; ++i) {
            for(int j = 0; j < rowLength; ++j) {
                if(!visited[i][j]) {
                    if(grid[i][j] == 'W') {
                        int count = bfs(grid, visited, i, j, 'W');
                        wPower += (count * count);
                    } else {
                        int count = bfs(grid, visited, i, j, 'B');
                        bPower += (count * count);
                    }
                }
            }
        }
        System.out.println(wPower + " " + bPower);
    }

    public static int bfs(char[][] grid, boolean[][] visited, int r, int c, char color) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] {r, c});
        visited[r][c] = true;

        int count = 1;
        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            for(int i = 0; i < 4; ++i) {
                int nextX = cur[0] + dr[i];
                int nextY = cur[1] + dc[i];
                if(nextX >= 0 && nextX < rowLength && nextY >= 0 && nextY < colLength
                        && grid[nextX][nextY] == color && !visited[nextX][nextY]) {
                    queue.offer(new int[] {nextX, nextY});
                    visited[nextX][nextY] = true;
                    count++;
                }
            }
        }

        return count;
    }
}
