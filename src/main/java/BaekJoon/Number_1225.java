import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number_1225 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = bufferedReader.readLine().split(" ");
        String A = input[0];
        String B = input[1];

        long sumA = 0;
        for (char c : A.toCharArray()) {
            sumA += (c - '0');
        }

        long sumB = 0;
        for (char c : B.toCharArray()) {
            sumB += (c - '0');
        }

        long result = sumA * sumB;
        System.out.println(result);
    }
}

