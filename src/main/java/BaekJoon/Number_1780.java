package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number_1780 {
    static int[][] paper;
    static int[] count = new int[3];

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        paper = new int[N][N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                paper[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        divide(0, 0, N);

        StringBuilder sb = new StringBuilder();
        sb.append(count[0]).append('\n');
        sb.append(count[1]).append('\n');
        sb.append(count[2]).append('\n');
        System.out.print(sb);
    }

    static void divide(int x, int y, int size) {
        if (isSame(x, y, size)) {
            count[paper[x][y] + 1]++;
            return;
        }

        int newSize = size / 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                divide(x + i * newSize, y + j * newSize, newSize);
            }
        }
    }

    static boolean isSame(int x, int y, int size) {
        int val = paper[x][y];
        for (int i = x; i < x + size; i++) {
            for (int j = y; j < y + size; j++) {
                if (paper[i][j] != val) return false;
            }
        }
        return true;
    }
}
