package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Number_14501 {

    static int N;
    static int[] day, pay;
    static int result = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(bufferedReader.readLine());

        day = new int[N + 1];
        pay = new int[N + 1];

        for(int i = 1; i <= N; ++i) {
            int[] input = Arrays.stream(bufferedReader.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            day[i] = input[0];
            pay[i] = input[1];
        }

        dfs(1, 0);
        System.out.println(result);
    }

    static void dfs(int curDay, int sum) {
        if (curDay == N + 1) {
            result = Math.max(result, sum);
            return;
        }

        if (curDay > N + 1) return;
        dfs(curDay + 1, sum);
        if (curDay + day[curDay] <= N + 1) {
            dfs(curDay + day[curDay], sum + pay[curDay]);
        }
    }
}
