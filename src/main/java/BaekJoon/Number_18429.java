package BaekJoon;

import java.io.*;
import java.util.*;

public class Number_18429 {

    static int N, K;
    static int[] kits;
    static boolean[] used;
    static int count = 0;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        kits = new int[N];
        used = new boolean[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            kits[i] = Integer.parseInt(st.nextToken());
        }

        dfs(0, 500); // day 0, initial weight 500
        System.out.println(count);
    }

    static void dfs(int day, int weight) {
        if (day == N) {
            count++;
            return;
        }

        for (int i = 0; i < N; i++) {
            if (used[i]) continue;

            int nextWeight = weight + kits[i] - K;
            if (nextWeight < 500) continue; // 조건 위반 → 가지치기

            used[i] = true;
            dfs(day + 1, nextWeight);
            used[i] = false;
        }
    }
}
