package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Number_1012 {
    static int m;
    static int n;
    static int[][] maps;
    static boolean[][] visited;
    static int[] dr = {0, 0, 1, -1};
    static int[] dc = {1, -1, 0, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int testCaseCount = Integer.parseInt(bufferedReader.readLine());

        StringBuilder result = new StringBuilder();

        for(int i = 0; i < testCaseCount; ++i) {
            int[] inputMNK = Arrays.stream(bufferedReader.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            m = inputMNK[0];
            n = inputMNK[1];
            int k = inputMNK[2];

            maps = new int[m][n];
            visited = new boolean[m][n];
            for(int j = 0; j < k; ++j) {
                int[] inputXY = Arrays.stream(bufferedReader.readLine().split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();
                int x = inputXY[0];
                int y = inputXY[1];

                maps[x][y] = 1;
            }

            int worm = 0;
            for(int x = 0; x < m; ++x) {
                for(int y = 0; y < n; ++y) {
                    if(maps[x][y] == 1 && !visited[x][y]) {
                        bfs(x, y);
                        ++worm;
                    }
                }
            }
            result.append(worm).append('\n');
        }
        System.out.println(result);
    }

    private static void bfs(int x, int y) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] {x, y});

        visited[x][y] = true;

        while(!queue.isEmpty()) {
            int[] cur = queue.poll();
            int curX = cur[0];
            int curY = cur[1];

            for(int p = 0; p < 4; ++p) {
                int nextX = curX + dr[p];
                int nextY = curY + dc[p];

                if(nextX >= 0 && nextX < m && nextY >= 0 && nextY < n
                        && maps[nextX][nextY] == 1 && !visited[nextX][nextY]) {
                    queue.offer(new int[] {nextX, nextY});
                    visited[nextX][nextY] = true;
                }
            }

        }
    }
}
