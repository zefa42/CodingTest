import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

/**
 * BOJ 15988 1, 2, 3 더하기 3
 *  - 순서가 있는 합의 개수
 *  - dp[i] = dp[i-1] + dp[i-2] + dp[i-3]  (mod 1_000_000_009)
 */
public class Number_15988 {

    private static final int MOD = 1_000_000_009;

    public static void main(String[] args) throws IOException {

        /* ---------- 1. 입력 ---------- */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());     // 테스트 케이스 개수

        int[] queries = new int[T];
        int maxN = 0;                                       // 가장 큰 n 찾기
        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine().trim());
            queries[i] = n;
            if (n > maxN) maxN = n;
        }

        /* ---------- 2. DP 전처리 ---------- */
        int[] dp = new int[maxN + 3];   // i-3까지 안전하게 접근하려고 +3
        dp[0] = 1;                      // “아무것도 안 더한” 1가지

        for (int i = 1; i <= maxN; i++) {
            long sum = 0L;              // long으로 먼저 합치고 한 번에 mod
            sum += dp[i - 1];
            sum += dp[i - 2];
            sum += dp[i - 3];
            dp[i] = (int)(sum % MOD);
        }

        /* ---------- 3. 출력 ---------- */
        StringBuilder sb = new StringBuilder();
        for (int n : queries) {
            sb.append(dp[n]).append('\n');
        }
        System.out.print(sb);
    }
}
