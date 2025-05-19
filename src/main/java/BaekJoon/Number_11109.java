import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Number_11109 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(bufferedReader.readLine());
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < count; ++i) {
            int[] numbers = Arrays.stream(bufferedReader.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            int d = numbers[0];
            int n = numbers[1];
            int s = numbers[2];
            int p = numbers[3];
            int first = n * s;
            int second = d + (n * p);
            if(first == second) {
                result.append("does not matter").append('\n');
            }
            else if(first < second) {
                result.append("do not parallelize").append('\n');
            }
            else {
                result.append("parallelize").append('\n');
            }

        }
        System.out.println(result);
    }
}
