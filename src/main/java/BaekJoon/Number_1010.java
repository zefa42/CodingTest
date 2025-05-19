import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number_1010 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int inputCount = Integer.parseInt(bufferedReader.readLine());
        StringBuilder result = new StringBuilder();

        for(int i = 0; i < inputCount; ++i) {
            String[] numbers = bufferedReader.readLine().split(" ");
            int N = Integer.parseInt(numbers[0]);
            int K = Integer.parseInt(numbers[1]);

            long answer = combination(K, N);
            result.append(answer).append('\n');
        }

        System.out.println(result);
    }

    /**
     * 오버플로우를 피하기 위해 팩토리얼을 직접 구하지 않고,
     * 곱셈과 나눗셈을 순차적으로 수행
     */
    private static long combination(int n, int r) {
        // nCr = nC(n-r)이므로, 더 작은 쪽으로 바꿔서 연산 횟수를 줄임
        r = Math.min(r, n - r);

        long result = 1;
        for (int i = 0; i < r; i++) {
            // 분자에 (n - i)을 곱한다
            result *= (n - i);
            // 분모 (i+1)로 나눈다
            result /= (i + 1);
        }
        return result;
    }
}
