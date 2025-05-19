import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number_9095 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        // dp 배열을 미리 구해놓는다. 문제에서 n은 11보다 작거나 같으므로 최대 10까지 구하면 된다.
        int[] dp = new int[11];  // 0부터 10까지
        dp[0] = 1;  // 아무것도 선택하지 않은 경우를 1로 초기화
        dp[1] = 1;  // 1만으로 만드는 경우: [1]
        dp[2] = 2;  // 2를 만드는 경우: [1+1, 2]
        dp[3] = 4;  // 3을 만드는 경우: [1+1+1, 1+2, 2+1, 3]

        // dp 배열 채우기: 각 숫자 n에 대해, dp[n] = dp[n-1] + dp[n-2] + dp[n-3]
        for (int i = 4; i < 11; i++) {
            dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
        }

        // 각 테스트 케이스에 대해 입력 받은 n의 경우의 수를 출력한다.
        StringBuilder sb = new StringBuilder();
        for (int t = 0; t < T; t++) {
            int n = Integer.parseInt(br.readLine());
            sb.append(dp[n]).append("\n");
        }
        System.out.print(sb);
    }
}
