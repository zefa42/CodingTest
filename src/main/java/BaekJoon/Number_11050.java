import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number_11050 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = bufferedReader.readLine().split(" ");
        System.out.println(calculate(input));
    }

    private static int calculate(String[] input) {
        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);
        int up = factorial(N) / factorial(N - K);
        int down = factorial(K);
        return up / down;

    }

    private static int factorial(int number) {
        if(number == 0) return 1;
        if(number == 1) return 1;
        return number * factorial((number - 1));
    }
}
