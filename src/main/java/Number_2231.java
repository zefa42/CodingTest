import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number_2231 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(bufferedReader.readLine());
        System.out.println(getConstructor(number));
    }

    private static int getConstructor(int number) {
        int numberLength = String.valueOf(number).length();
        // 후보의 시작점 찾기
        int start = Math.max(1, number - (9 * numberLength));

        for (int candidate = start; candidate < number; candidate++) {
            int sum = candidate;
            int temp = candidate;
            while (temp > 0) {
                sum += temp % 10;
                temp /= 10;
            }
            if (sum == number) {
                return candidate;
            }
        }
        return 0;
    }

}
