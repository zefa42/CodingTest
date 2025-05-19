import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Number_1312 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int[] input = Arrays.stream(bufferedReader.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int A = input[0];
        int B = input[1];
        int N = input[2];
        int result = A % B;
        int digit = 0;
        for(int i = 0; i < N; ++i) {
            result *= 10;
            digit = result / B;
            result %= B;
        }
        System.out.println(digit);
    }
}
