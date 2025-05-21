package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Number_1303 {
    static final int[] dr = {1, 0, -1, 0};
    static final int[] dc = {0, -1, 0, 1};
    static boolean[][] visited;
    static char[][] grid;
    static int rowLength, colLength;

    static boolean isValid(int r, int c) {
        return r < rowLength && r >= 0 && c < colLength && c >= 0;
    }

    static int dfs(int r, int c, char color) {
       visited[r][c] = true;
       int count = 1;
       for(int i = 0; i < 4; ++i) {
           int nextRow = r + dr[i];
           int nextCol = c + dc[i];
           if(isValid(nextRow, nextCol)) {
               if(!visited[nextRow][nextCol] && grid[nextRow][nextCol] == color) {
                   count += dfs(nextRow, nextCol, color);
               }
           }
       }
       return count;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int[] input = Arrays.stream(bufferedReader.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        rowLength = input[0];
        colLength = input[1];
        visited = new boolean[rowLength][colLength];
        grid = new char[rowLength][colLength];

        for(int i = 0; i < rowLength; ++i) {
            String row = bufferedReader.readLine();
            for(int j = 0; j < colLength; ++j) {
                grid[i][j] = row.charAt(j);
            }
        }

        int w = 0, b = 0;
        for(int r = 0; r < rowLength; ++r) {
            for(int c = 0; c < colLength; ++c) {
                if(!visited[r][c]) {
                    int soldiers = dfs(r, c, grid[r][c]);
                    int power = soldiers * soldiers;
                    if(grid[r][c] == 'W') {
                        w += power;
                    } else {
                        b += power;
                    }
                }
            }
        }
        System.out.println(w + " " + b);
    }
}
