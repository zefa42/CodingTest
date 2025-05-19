import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Number_1253 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int numberCount = Integer.parseInt(bufferedReader.readLine());
        int[] numbers = Arrays.stream(bufferedReader.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .sorted()
                .toArray();

        int result = 0;
        for(int i = 0; i < numberCount; ++i) {
            int find = numbers[i];
            int start = 0;
            int end = numberCount - 1;

            while(start < end) {
                if(numbers[start] + numbers[end] == find) {
                    if(start != i && end != i) {
                        result++;
                        break;
                    }
                    else if(start == i) {
                        start++;
                    }
                    else if(end == i) {
                        end--;
                    }
                }
                else if(numbers[start] + numbers[end] < find) {
                    start++;
                }
                else {
                    end--;
                }
            }
        }
        System.out.println(result);
    }
}
