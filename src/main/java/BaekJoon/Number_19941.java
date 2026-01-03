package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number_19941 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        char[] arr = br.readLine().toCharArray();
        boolean[] eaten = new boolean[N];

        int answer = 0;

        for (int i = 0; i < N; i++) {
            if (arr[i] == 'P') {
                // 왼쪽부터 탐색
                for (int j = Math.max(0, i - K); j <= Math.min(N - 1, i + K); j++) {
                    if (arr[j] == 'H' && !eaten[j]) {
                        eaten[j] = true;
                        answer++;
                        break;
                    }
                }
            }
        }

        System.out.println(answer);
    }
}
