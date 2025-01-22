import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Number_1292 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int[] input = Arrays.stream(bufferedReader.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int start = input[0];
        int end = input[1];

        List<Integer> nums = new ArrayList<>();
        int[] sum = new int[end + 1];
        for(int i = 1; i <= end; ++i) {
            for(int j = 0; j < i; ++j) {
                nums.add(i);
            }
        }
        int[] numbers = nums.stream().mapToInt(Integer::intValue).toArray();

        for(int i = 0; i < end; ++i) {
            sum[i + 1] = sum[i] + numbers[i];
        }
        System.out.println(sum[end] - sum[start - 1]);
    }
}
