import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Number_15688 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(bufferedReader.readLine());
        StringBuilder result = new StringBuilder();
        int[] numbers = new int[count];
        for(int i = 0; i < count; ++i) {
            int number = Integer.parseInt(bufferedReader.readLine());
            numbers[i] = (number);
        }

        Arrays.sort(numbers);
        for(int num : numbers) {
            result.append(num).append('\n');
        }
        System.out.println(result);
    }
}
