package Programmers;

import java.util.*;

class GameMapShortestDistance{
    static int rowLength;
    static int colLength;

    static int[] dr = {1, -1, 0, 0};
    static int[] dc = {0, 0, 1, -1};

    public int solution(int[][] maps) {
        rowLength = maps.length;
        colLength = maps[0].length;
        int[][] dist = new int[rowLength][colLength];
        return bfs(maps, dist);
    }

    public int bfs(int[][] maps, int[][] dist) {
        Queue<int[]> queue = new ArrayDeque<>();
        queue.offer(new int[] {0, 0});
        dist[0][0] = 1;

        while(!queue.isEmpty()) {
            int[] cur = queue.poll();
            int curRow = cur[0];
            int curCol = cur[1];
            if (curRow == rowLength - 1 && curCol == colLength - 1) {
                return dist[curRow][curCol];
            }

            for(int i = 0; i < 4; ++i) {
                int nextRow = curRow + dr[i];
                int nextCol = curCol + dc[i];
                if(nextRow >= 0 && nextRow < rowLength
                        && nextCol >= 0 && nextCol < colLength
                        && maps[nextRow][nextCol] == 1 && dist[nextRow][nextCol] == 0) {
                    dist[nextRow][nextCol] = dist[curRow][curCol] + 1;
                    queue.offer(new int[] {nextRow, nextCol});
                }
            }
        }
        return -1;
    }
}