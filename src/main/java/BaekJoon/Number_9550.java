import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number_9550 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()); // 테스트 케이스 수

        for (int t = 0; t < T; t++) {
            // N과 K 입력
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken()); // 사탕 종류 수
            int K = Integer.parseInt(st.nextToken()); // 최소 사탕 개수

            // 사탕 개수 입력
            st = new StringTokenizer(br.readLine());
            int[] candies = new int[N];
            for (int i = 0; i < N; i++) {
                candies[i] = Integer.parseInt(st.nextToken());
            }

            // 최대 참석 가능 아이 수 계산
            int maxChildren = 0;
            for (int i = 0; i < N; i++) {
                maxChildren += candies[i] / K; // 각 사탕 종류별로 나눠줄 수 있는 아이 수
            }

            // 결과 출력
            System.out.println(maxChildren);
        }
    }
}
