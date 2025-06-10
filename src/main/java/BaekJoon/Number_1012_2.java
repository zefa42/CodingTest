package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Number_1012_2 {
    static int[] dr = {0, 0, -1, 1};
    static int[] dc = {1, -1, 0, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int testCount = Integer.parseInt(bufferedReader.readLine());

        StringBuilder result = new StringBuilder();
        for(int i = 0; i < testCount; ++i) {
            int[] size = Arrays.stream(bufferedReader.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            int M = size[0];
            int N = size[1];
            int K = size[2];

            int[][] grid = new int[M][N];
            boolean[][] visited = new boolean[M][N];
            for(int j = 0; j < K; ++j) {
                int[] worm = Arrays.stream(bufferedReader.readLine().split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();
                int wormX = worm[0];
                int wormY = worm[1];
                grid[wormX][wormY] = 1;
            }

            int count = 0;
            for(int row = 0; row < M; ++row) {
                for( int col = 0; col < N; ++col) {
                    if(grid[row][col] == 1 && !visited[row][col]) {
                        Queue<int[]> queue = new LinkedList<>();
                        visited[row][col] = true;
                        queue.offer(new int[]{row, col});

                        while(!queue.isEmpty()) {
                            int[] cur = queue.poll();
                            int curX = cur[0];
                            int curY = cur[1];

                            for(int c = 0; c < 4; ++c) {
                                int nextX = curX + dr[c];
                                int nextY = curY + dc[c];

                                if(nextX >= 0 && nextX < M && nextY >= 0 && nextY < N && grid[nextX][nextY] == 1 && !visited[nextX][nextY]) {
                                    queue.offer(new int[] {nextX, nextY});
                                    visited[nextX][nextY] = true;
                                }
                            }
                        }
                        count++;
                    }
                }
            }
            result.append(count).append('\n');
        }
        System.out.println(result);
    }
}
