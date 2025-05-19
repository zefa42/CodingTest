import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number_1965 {          // BOJ 1965
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());

        int[] a = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) a[i] = Integer.parseInt(st.nextToken());

        int[] dp = new int[n];           // dp[i] : a[i]를 끝으로 하는 LIS 길이
        int answer = 0;

        for (int i = 0; i < n; i++) {
            dp[i] = 1;                   // 자기 자신만 선택
            for (int j = 0; j < i; j++) {
                if (a[j] < a[i])         // 앞에 있고 더 작으면
                    dp[i] = Math.max(dp[i], dp[j] + 1);
            }
            answer = Math.max(answer, dp[i]);
        }

        System.out.println(answer);
    }
}