import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Number_3058 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(bufferedReader.readLine());
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < count; ++i) {
            int[] input = Arrays.stream(bufferedReader.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .sorted()
                    .toArray();
            result.append(calculateEvenNumber(input)).append(" ").append(findSmallEvenNumber(input)).append('\n');
        }
        System.out.println(result);
    }

    private static int findSmallEvenNumber(int[] input) {
        for (int number : input) {
            if (number % 2 == 0) {
                return number;
            }
        }
        return 0;
    }

    private static int calculateEvenNumber(int[] input) {
        int sum = 0;
        for (int number : input) {
            if (number % 2 == 0) {
                sum += number;
            }
        }
        return sum;
    }
}
