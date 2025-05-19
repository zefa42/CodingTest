import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Number_1427 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
         StringBuilder result = new StringBuilder();
         int[] numbers = Arrays.stream(bufferedReader.readLine().split(""))
                 .mapToInt(Integer::parseInt)
                 .sorted()
                 .toArray();
         for(int i = 0; i < numbers.length / 2; ++i) {
             int tmp = numbers[i];
             numbers[i] = numbers[numbers.length - 1 - i];
             numbers[numbers.length - 1 -i] = tmp;
         }
        for (int number : numbers) {
            result.append(number);
        }
         System.out.println(result);
    }
}
