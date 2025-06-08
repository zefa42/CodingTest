package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.*;

public class Number_2667_2 {
    static int[] dr = {0, 0, 1, -1};
    static int[] dc = {1, -1, 0, 0};
    static int size;
    static List<Integer> result = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        size = Integer.parseInt(bufferedReader.readLine());
        int[][] grid = new int[size][size];
        for(int i = 0; i < size; ++i) {
            int[] input = Arrays.stream(bufferedReader.readLine().split(""))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            for(int j = 0; j < size; ++j) {
                grid[i][j] = input[j];
            }
        }

        boolean[][] visited = new boolean[size][size];

        for(int i = 0; i < size; ++i) {
            for(int j = 0; j < size; ++j) {
                if(!visited[i][j] && grid[i][j] == 1) {
                    int count = dfs(grid, visited, i, j);
                    result.add(count);
                }
            }
        }
        Collections.sort(result);
        System.out.println(result.size());
        for(Integer res : result) {
            System.out.println(res);
        }
    }

    public static int dfs(int[][] grid, boolean[][] visited, int curX, int curY) {
        visited[curX][curY] = true;
        int count = 1;
        for(int i = 0; i < 4; ++i) {
            int nextX = curX + dr[i];
            int nextY = curY + dc[i];
            if(nextX >= 0 && nextX < size && nextY >= 0 && nextY < size
                    && !visited[nextX][nextY] && grid[nextX][nextY] == 1) {
                count += dfs(grid, visited, nextX, nextY);
            }
        }
        return count;
    }
}
