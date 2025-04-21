import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Number_2667 {
    static int N;
    static int[][] grid;
    static boolean[][] visited;

    // 상, 하, 좌, 우
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(bufferedReader.readLine());
        N = count;  // 전역 N 초기화
        grid = new int[N][N];
        visited = new boolean[N][N];

        for (int i = 0; i < N; ++i) {
            int[] input = Arrays.stream(bufferedReader.readLine().split(""))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            grid[i] = input;
        }

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < N; ++i) {
            for (int j = 0; j < N; ++j) {
                if (grid[i][j] == 1 && !visited[i][j]) {
                    int houseCount = bfs(i, j);
                    result.add(houseCount);
                }
            }
        }

        Collections.sort(result);
        System.out.println(result.size());
        for (int s : result) {
            System.out.println(s);
        }
    }

    private static int bfs(int x, int y) {
        Queue<int[]> queue = new LinkedList<>();
        visited[x][y] = true;
        queue.add(new int[]{x, y});

        int count = 1;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int cx = current[0], cy = current[1];

            for (int dir = 0; dir < 4; dir++) {
                int nx = cx + dx[dir];
                int ny = cy + dy[dir];

                // 범위 검사
                if (nx < 0 || nx >= N || ny < 0 || ny >= N) continue;
                // 아직 방문 안 했고 집(1)이면
                if (!visited[nx][ny] && grid[nx][ny] == 1) {
                    visited[nx][ny] = true;
                    queue.add(new int[]{nx, ny});
                    count++;
                }
            }
        }

        return count;
    }
}
