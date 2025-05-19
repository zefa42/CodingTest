import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Number_2355 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = Arrays.stream(bufferedReader.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        long start = Math.min(numbers[0], numbers[1]);
        long end = Math.max(numbers[0], numbers[1]);

        long n = end - start + 1;
        long sum = n * (start + end) / 2;
        System.out.println(sum);
    }
}
