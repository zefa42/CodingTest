package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Number_4963_2 {
    static int rowLength;
    static int colLength;

    static int[] dr = {0, 0, 1, 1, -1, 1, -1, -1};
    static int[] dc = {1, -1, 1, -1, 0, 0, 1, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();

        while(true) {
            String testCase = bufferedReader.readLine();
            if(testCase.equals("0 0")) {
                break;
            }
            int count = 0;
            int[] size = Arrays.stream(testCase.split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            rowLength = size[0];
            colLength = size[1];

            int[][] grid = new int[colLength][rowLength];
            boolean[][] visited = new boolean[colLength][rowLength];
            for(int i = 0; i < colLength; ++i) {
                int[] row = Arrays.stream(bufferedReader.readLine().split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();
                for(int j = 0; j < rowLength; ++j) {
                    grid[i][j] = row[j];
                }
            }

            for(int i = 0; i < colLength; ++i) {
                for(int j = 0; j < rowLength; ++j) {
                    if(!visited[i][j] && grid[i][j] == 1) {
                        dfs(grid, visited, i, j);
                        count++;
                    }
                }
            }
            result.append(count).append('\n');
        }

        System.out.println(result);
    }

    public static void dfs(int[][] grid, boolean[][] visited, int r, int c) {
        visited[r][c] = true;

        for(int i = 0; i < 8; ++i) {
            int nextX = r + dr[i];
            int nextY = c + dc[i];
            if(nextX >= 0 && nextX < colLength && nextY >= 0 && nextY < rowLength
            && grid[nextX][nextY] == 1 && !visited[nextX][nextY]) {
                dfs(grid, visited, nextX, nextY);
                visited[nextX][nextY] = true;
            }
        }
    }
}
