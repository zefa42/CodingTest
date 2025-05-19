import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number_2018 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); 

        int count = 0;                // 방법의 개수를 셀 변수
        int left = 1;                // 연속 구간의 시작
        int right = 1;               // 연속 구간의 끝
        int sum = 1;                 // [left..right] 구간의 합, 초기엔 1로 시작

        while (left <= N && right <= N) {
            if (sum == N) {
                count++;
                right++;
                if (right <= N) {
                    sum += right;
                }
            } else if (sum < N) {
                right++;
                if (right <= N) {
                    sum += right;
                }
            } else {
                sum -= left;
                left++;
            }
        }

        System.out.println(count);
    }
}
