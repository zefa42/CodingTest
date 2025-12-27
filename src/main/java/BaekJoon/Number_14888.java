package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Number_14888 {
    static int N;
    static int[] number;
    static int[] oper;
    static int max = -1_000_000_000;
    static int min = 1_000_000_000;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(bufferedReader.readLine());
        number = new int[N];
        oper = new int[4];

        number = Arrays.stream(bufferedReader.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        oper = Arrays.stream(bufferedReader.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        dfs(1, number[0]);

        System.out.println(max);
        System.out.println(min);
    }

    static void dfs(int idx, int value) {
        if (idx == N) {
            max = Math.max(max, value);
            min = Math.min(min, value);
            return;
        }

        for (int i = 0; i < 4; i++) {
            if (oper[i] > 0) {
                oper[i]--;

                switch (i) {
                    case 0: {
                        dfs(idx + 1, value + number[idx]);
                    } break;
                    case 1: {
                        dfs(idx + 1, value - number[idx]);
                    } break;
                    case 2: {
                        dfs(idx + 1, value * number[idx]);
                    } break;
                    case 3: {
                        dfs(idx + 1, value / number[idx]);
                    } break;
                }

                oper[i]++;
            }
        }
    }
}
